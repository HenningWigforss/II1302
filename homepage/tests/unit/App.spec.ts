import { mount } from '@vue/test-utils'
import App from '@/App.vue'

describe("App.vue", () => {
    //You can call your main function(props.YOUR example you need test)
    it("Should render About text", () => {
        const wrapper = mount(App)
        expect(wrapper.text()).toContain("About")
    })

})
