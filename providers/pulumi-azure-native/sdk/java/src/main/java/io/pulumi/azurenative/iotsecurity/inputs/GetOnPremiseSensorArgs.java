// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOnPremiseSensorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOnPremiseSensorArgs Empty = new GetOnPremiseSensorArgs();

    /**
     * Name of the on-premise IoT sensor
     * 
     */
    @InputImport(name="onPremiseSensorName", required=true)
    private final String onPremiseSensorName;

    public String getOnPremiseSensorName() {
        return this.onPremiseSensorName;
    }

    public GetOnPremiseSensorArgs(String onPremiseSensorName) {
        this.onPremiseSensorName = Objects.requireNonNull(onPremiseSensorName, "expected parameter 'onPremiseSensorName' to be non-null");
    }

    private GetOnPremiseSensorArgs() {
        this.onPremiseSensorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnPremiseSensorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String onPremiseSensorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOnPremiseSensorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onPremiseSensorName = defaults.onPremiseSensorName;
        }

        public Builder setOnPremiseSensorName(String onPremiseSensorName) {
            this.onPremiseSensorName = Objects.requireNonNull(onPremiseSensorName);
            return this;
        }

        public GetOnPremiseSensorArgs build() {
            return new GetOnPremiseSensorArgs(onPremiseSensorName);
        }
    }
}
