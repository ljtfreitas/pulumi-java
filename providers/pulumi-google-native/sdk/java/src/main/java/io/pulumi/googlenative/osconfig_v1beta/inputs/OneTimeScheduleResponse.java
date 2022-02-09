// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class OneTimeScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final OneTimeScheduleResponse Empty = new OneTimeScheduleResponse();

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