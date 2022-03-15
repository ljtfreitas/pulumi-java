// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail.inputs;

import io.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstancePublicPortsState extends io.pulumi.resources.ResourceArgs {

    public static final InstancePublicPortsState Empty = new InstancePublicPortsState();

    /**
     * Name of the Lightsail Instance.
     * 
     */
    @Import(name="instanceName")
      private final @Nullable Output<String> instanceName;

    public Output<String> getInstanceName() {
        return this.instanceName == null ? Output.empty() : this.instanceName;
    }

    /**
     * Configuration block with port information. AWS closes all currently open ports that are not included in the `port_info`. Detailed below.
     * 
     */
    @Import(name="portInfos")
      private final @Nullable Output<List<InstancePublicPortsPortInfoGetArgs>> portInfos;

    public Output<List<InstancePublicPortsPortInfoGetArgs>> getPortInfos() {
        return this.portInfos == null ? Output.empty() : this.portInfos;
    }

    public InstancePublicPortsState(
        @Nullable Output<String> instanceName,
        @Nullable Output<List<InstancePublicPortsPortInfoGetArgs>> portInfos) {
        this.instanceName = instanceName;
        this.portInfos = portInfos;
    }

    private InstancePublicPortsState() {
        this.instanceName = Output.empty();
        this.portInfos = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePublicPortsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceName;
        private @Nullable Output<List<InstancePublicPortsPortInfoGetArgs>> portInfos;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePublicPortsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceName = defaults.instanceName;
    	      this.portInfos = defaults.portInfos;
        }

        public Builder instanceName(@Nullable Output<String> instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        public Builder instanceName(@Nullable String instanceName) {
            this.instanceName = Output.ofNullable(instanceName);
            return this;
        }

        public Builder portInfos(@Nullable Output<List<InstancePublicPortsPortInfoGetArgs>> portInfos) {
            this.portInfos = portInfos;
            return this;
        }

        public Builder portInfos(@Nullable List<InstancePublicPortsPortInfoGetArgs> portInfos) {
            this.portInfos = Output.ofNullable(portInfos);
            return this;
        }
        public InstancePublicPortsState build() {
            return new InstancePublicPortsState(instanceName, portInfos);
        }
    }
}
