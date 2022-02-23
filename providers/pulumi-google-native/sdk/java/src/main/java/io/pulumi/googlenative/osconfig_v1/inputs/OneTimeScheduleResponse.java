// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Sets the time for a one time patch deployment. Timestamp is in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
 * 
 */
public final class OneTimeScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final OneTimeScheduleResponse Empty = new OneTimeScheduleResponse();

    /**
     * The desired patch job execution time.
     * 
     */
    @InputImport(name="executeTime", required=true)
      private final String executeTime;

    public String getExecuteTime() {
        return this.executeTime;
    }

    public OneTimeScheduleResponse(String executeTime) {
        this.executeTime = Objects.requireNonNull(executeTime, "expected parameter 'executeTime' to be non-null");
    }

    private OneTimeScheduleResponse() {
        this.executeTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneTimeScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executeTime;

        public Builder() {
    	      // Empty
        }

        public Builder(OneTimeScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
        }

        public Builder setExecuteTime(String executeTime) {
            this.executeTime = Objects.requireNonNull(executeTime);
            return this;
        }
        public OneTimeScheduleResponse build() {
            return new OneTimeScheduleResponse(executeTime);
        }
    }
}
