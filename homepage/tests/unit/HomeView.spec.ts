import { mount } from "@vue/test-utils";
import HomeView from "@/views/HomeView.vue";

describe("HomeView.vue", () => {
  //You can call your main function(if you need fined text "GitHub")
  it("Should render text", () => {
    const wrapper = mount(HomeView);

    expect(wrapper.text()).toContain("Message Queue");
  });

  //Test2
  it("increments submit value on click", async () => {
    const wrapper = mount(HomeView);
    const button = wrapper.find("button");

    const text = wrapper.find("submit");

    // expect(text.text()).toContain("submit");

    await button.trigger("click");
    // expect(text.text()).toContain("text");
  });
});
