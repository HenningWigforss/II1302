import { mount } from '@vue/test-utils'
import AboutView from '@/views/AboutView.vue'

describe("AboutView.vue", () => {
    //You can call your main function(if you need fined text "GitHub")
    it("Should render Github text", () => {
        const wrapper = mount(AboutView)

        expect(wrapper.text()).toContain("Github")
    })


})
