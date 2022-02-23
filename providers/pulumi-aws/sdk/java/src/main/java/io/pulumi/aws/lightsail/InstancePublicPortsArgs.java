// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail;

import io.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstancePublicPortsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstancePublicPortsArgs Empty = new InstancePublicPortsArgs();

    /**
     * Name of the Lightsail Instance.
     * 
     */
    @InputImport(name="instanceName", required=true)
    private final Input<String> instanceName;

    public Input<String> getInstanceName() {
        return this.instanceName;
    }

    /**
     * Configuration block with port information. AWS closes all currently open ports that are not included in the `port_info`. Detailed below.
     * 
     */
    @InputImport(name="portInfos", required=true)
    private final Input<List<InstancePublicPortsPortInfoArgs>> portInfos;

    public Input<List<InstancePublicPortsPortInfoArgs>> getPortInfos() {
        return this.portInfos;
    }

    public InstancePublicPortsArgs(
        Input<String> instanceName,
        Input<List<InstancePublicPortsPortInfoArgs>> portInfos) {
        this.instanceName = Objects.requireNonNull(instanceName, "expected parameter 'instanceName' to be non-null");
        this.portInfos = Objects.requireNonNull(portInfos, "expected parameter 'portInfos' to be non-null");
    }

    private InstancePublicPortsArgs() {
        this.instanceName = Input.empty();
        this.portInfos = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePublicPortsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> instanceName;
        private Input<List<InstancePublicPortsPortInfoArgs>> portInfos;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePublicPortsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceName = defaults.instanceName;
    	      this.portInfos = defaults.portInfos;
        }

        public Builder setInstanceName(Input<String> instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }

        public Builder setInstanceName(String instanceName) {
            this.instanceName = Input.of(Objects.requireNonNull(instanceName));
            return this;
        }

        public Builder setPortInfos(Input<List<InstancePublicPortsPortInfoArgs>> portInfos) {
            this.portInfos = Objects.requireNonNull(portInfos);
            return this;
        }

        public Builder setPortInfos(List<InstancePublicPortsPortInfoArgs> portInfos) {
            this.portInfos = Input.of(Objects.requireNonNull(portInfos));
            return this;
        }
        public InstancePublicPortsArgs build() {
            return new InstancePublicPortsArgs(instanceName, portInfos);
        }
    }
}
