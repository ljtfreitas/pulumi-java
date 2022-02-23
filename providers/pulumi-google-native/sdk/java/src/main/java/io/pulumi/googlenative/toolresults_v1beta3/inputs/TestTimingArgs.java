// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.DurationArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Testing timing break down to know phases.
 * 
 */
public final class TestTimingArgs extends io.pulumi.resources.ResourceArgs {

    public static final TestTimingArgs Empty = new TestTimingArgs();

    /**
     * How long it took to run the test process. - In response: present if previously set. - In create/update request: optional
     * 
     */
    @InputImport(name="testProcessDuration")
      private final @Nullable Input<DurationArgs> testProcessDuration;

    public Input<DurationArgs> getTestProcessDuration() {
        return this.testProcessDuration == null ? Input.empty() : this.testProcessDuration;
    }

    public TestTimingArgs(@Nullable Input<DurationArgs> testProcessDuration) {
        this.testProcessDuration = testProcessDuration;
    }

    private TestTimingArgs() {
        this.testProcessDuration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestTimingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DurationArgs> testProcessDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(TestTimingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testProcessDuration = defaults.testProcessDuration;
        }

        public Builder setTestProcessDuration(@Nullable Input<DurationArgs> testProcessDuration) {
            this.testProcessDuration = testProcessDuration;
            return this;
        }

        public Builder setTestProcessDuration(@Nullable DurationArgs testProcessDuration) {
            this.testProcessDuration = Input.ofNullable(testProcessDuration);
            return this;
        }
        public TestTimingArgs build() {
            return new TestTimingArgs(testProcessDuration);
        }
    }
}
