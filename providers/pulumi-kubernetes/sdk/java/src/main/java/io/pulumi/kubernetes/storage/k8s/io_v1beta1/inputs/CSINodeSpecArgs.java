// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs.CSINodeDriverArgs;
import java.util.List;
import java.util.Objects;


/**
 * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
 * 
 */
public final class CSINodeSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final CSINodeSpecArgs Empty = new CSINodeSpecArgs();

    /**
     * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
     * 
     */
    @InputImport(name="drivers", required=true)
        private final Input<List<CSINodeDriverArgs>> drivers;

    public Input<List<CSINodeDriverArgs>> getDrivers() {
        return this.drivers;
    }

    public CSINodeSpecArgs(Input<List<CSINodeDriverArgs>> drivers) {
        this.drivers = Objects.requireNonNull(drivers, "expected parameter 'drivers' to be non-null");
    }

    private CSINodeSpecArgs() {
        this.drivers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSINodeSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<CSINodeDriverArgs>> drivers;

        public Builder() {
    	      // Empty
        }

        public Builder(CSINodeSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drivers = defaults.drivers;
        }

        public Builder setDrivers(Input<List<CSINodeDriverArgs>> drivers) {
            this.drivers = Objects.requireNonNull(drivers);
            return this;
        }

        public Builder setDrivers(List<CSINodeDriverArgs> drivers) {
            this.drivers = Input.of(Objects.requireNonNull(drivers));
            return this;
        }
        public CSINodeSpecArgs build() {
            return new CSINodeSpecArgs(drivers);
        }
    }
}
