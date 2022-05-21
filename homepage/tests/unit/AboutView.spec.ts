import { mount } from '@vue/test-utils'
import AboutView from '@/views/AboutView.vue'

describe("AboutView.vue", () => {
    //You can call your main function(if you need fined text "GitHub")
    it("Should render text", () => {
        const wrapper = mount(AboutView)

        expect(wrapper.text()).toContain("Contact Me")
    })

    //Test2
    it('Should render text', async () => {
        const wrapper = mount(AboutView)
        //const button = wrapper.find('button')
        const text = wrapper.find('about')
        //expect(text.text()).toContain('Total clicks: 0')
        //await button.trigger('click')
       // expect(text.text()).toContain('II1302')
       expect(wrapper.text()).toContain("II1302")
      })











})
