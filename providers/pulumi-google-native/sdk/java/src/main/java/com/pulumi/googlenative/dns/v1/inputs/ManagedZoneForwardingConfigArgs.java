// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns.v1.inputs.ManagedZoneForwardingConfigNameServerTargetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedZoneForwardingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZoneForwardingConfigArgs Empty = new ManagedZoneForwardingConfigArgs();

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * List of target name servers to forward to. Cloud DNS selects the best available name server if more than one target is given.
     * 
     */
    @Import(name="targetNameServers")
    private @Nullable Output<List<ManagedZoneForwardingConfigNameServerTargetArgs>> targetNameServers;

    /**
     * @return List of target name servers to forward to. Cloud DNS selects the best available name server if more than one target is given.
     * 
     */
    public Optional<Output<List<ManagedZoneForwardingConfigNameServerTargetArgs>>> targetNameServers() {
        return Optional.ofNullable(this.targetNameServers);
    }

    private ManagedZoneForwardingConfigArgs() {}

    private ManagedZoneForwardingConfigArgs(ManagedZoneForwardingConfigArgs $) {
        this.kind = $.kind;
        this.targetNameServers = $.targetNameServers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneForwardingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneForwardingConfigArgs $;

        public Builder() {
            $ = new ManagedZoneForwardingConfigArgs();
        }

        public Builder(ManagedZoneForwardingConfigArgs defaults) {
            $ = new ManagedZoneForwardingConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param targetNameServers List of target name servers to forward to. Cloud DNS selects the best available name server if more than one target is given.
         * 
         * @return builder
         * 
         */
        public Builder targetNameServers(@Nullable Output<List<ManagedZoneForwardingConfigNameServerTargetArgs>> targetNameServers) {
            $.targetNameServers = targetNameServers;
            return this;
        }

        /**
         * @param targetNameServers List of target name servers to forward to. Cloud DNS selects the best available name server if more than one target is given.
         * 
         * @return builder
         * 
         */
        public Builder targetNameServers(List<ManagedZoneForwardingConfigNameServerTargetArgs> targetNameServers) {
            return targetNameServers(Output.of(targetNameServers));
        }

        /**
         * @param targetNameServers List of target name servers to forward to. Cloud DNS selects the best available name server if more than one target is given.
         * 
         * @return builder
         * 
         */
        public Builder targetNameServers(ManagedZoneForwardingConfigNameServerTargetArgs... targetNameServers) {
            return targetNameServers(List.of(targetNameServers));
        }

        public ManagedZoneForwardingConfigArgs build() {
            return $;
        }
    }

}
