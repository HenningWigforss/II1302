import { mount } from "@vue/test-utils";
import HomeView from "@/views/HomeView.vue";

describe("HomeView.vue", () => {
  //Test1 You can call your main function(props.YOUR example you need test)
  it("Should render Time text", () => {
    const wrapper = mount(HomeView);
    expect(wrapper.text()).toContain("Time");
  });

  //example Test2 You can call your main function(props.YOUR example you need test)
  it("Should render nav-item text", () => {
    const wrapper = mount(HomeView);
    expect(wrapper.text()).toContain("Canvas Side");
  });




});
