// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.DurationResponse;
import java.util.Objects;

@CustomType
public final class TestTimingResponse {
    /**
     * How long it took to run the test process. - In response: present if previously set. - In create/update request: optional
     * 
     */
    private final DurationResponse testProcessDuration;

    @CustomType.Constructor
    private TestTimingResponse(@CustomType.Parameter("testProcessDuration") DurationResponse testProcessDuration) {
        this.testProcessDuration = testProcessDuration;
    }

    /**
     * How long it took to run the test process. - In response: present if previously set. - In create/update request: optional
     * 
    */
    public DurationResponse getTestProcessDuration() {
        return this.testProcessDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestTimingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse testProcessDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(TestTimingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testProcessDuration = defaults.testProcessDuration;
        }

        public Builder testProcessDuration(DurationResponse testProcessDuration) {
            this.testProcessDuration = Objects.requireNonNull(testProcessDuration);
            return this;
        }
        public TestTimingResponse build() {
            return new TestTimingResponse(testProcessDuration);
        }
    }
}
