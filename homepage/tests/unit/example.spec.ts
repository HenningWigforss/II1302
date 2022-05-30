import { shallowMount } from '@vue/test-utils'
import HomeView from '@/views/HomeView.vue'

describe('HomeView.vue', () => {
  it('renders props.msg when passed', () => {
    const msg = 'new message'
    const wrapper = shallowMount(HomeView, {
      props: { msg }
    })
    expect(wrapper.text()).toMatch(msg)
  })
})

//import { mount } from '@vue/test-utils'
//import AboutView from '@/views/AboutView.vue'

//describe("AboutView.vue", () => {
    //You can call your main function(if you need fined text "GitHub")
  //  it("Should render Github text", () => {
    //    const wrapper = mount(AboutView)

      //  expect(wrapper.text()).toContain("Github")
    //})


//})
