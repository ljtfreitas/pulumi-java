// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ports and any VIF attached to segment.
 * 
 */
public final class WorkloadNetworkSegmentPortVifResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkloadNetworkSegmentPortVifResponse Empty = new WorkloadNetworkSegmentPortVifResponse();

    /**
     * Name of port or VIF attached to segment.
     * 
     */
    @InputImport(name="portName")
    private final @Nullable String portName;

    public Optional<String> getPortName() {
        return this.portName == null ? Optional.empty() : Optional.ofNullable(this.portName);
    }

    public WorkloadNetworkSegmentPortVifResponse(@Nullable String portName) {
        this.portName = portName;
    }

    private WorkloadNetworkSegmentPortVifResponse() {
        this.portName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadNetworkSegmentPortVifResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String portName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadNetworkSegmentPortVifResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portName = defaults.portName;
        }

        public Builder setPortName(@Nullable String portName) {
            this.portName = portName;
            return this;
        }

        public WorkloadNetworkSegmentPortVifResponse build() {
            return new WorkloadNetworkSegmentPortVifResponse(portName);
        }
    }
}
