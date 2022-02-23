// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.DurationResponse;
import java.util.Objects;


/**
 * Testing timing break down to know phases.
 * 
 */
public final class TestTimingResponse extends io.pulumi.resources.InvokeArgs {

    public static final TestTimingResponse Empty = new TestTimingResponse();

    /**
     * How long it took to run the test process. - In response: present if previously set. - In create/update request: optional
     * 
     */
    @InputImport(name="testProcessDuration", required=true)
      private final DurationResponse testProcessDuration;

    public DurationResponse getTestProcessDuration() {
        return this.testProcessDuration;
    }

    public TestTimingResponse(DurationResponse testProcessDuration) {
        this.testProcessDuration = Objects.requireNonNull(testProcessDuration, "expected parameter 'testProcessDuration' to be non-null");
    }

    private TestTimingResponse() {
        this.testProcessDuration = null;
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

        public Builder setTestProcessDuration(DurationResponse testProcessDuration) {
            this.testProcessDuration = Objects.requireNonNull(testProcessDuration);
            return this;
        }
        public TestTimingResponse build() {
            return new TestTimingResponse(testProcessDuration);
        }
    }
}
