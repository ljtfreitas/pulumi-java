// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.azurenative.deviceupdate.inputs.GroupConnectivityInformationArgs;
import io.pulumi.azurenative.deviceupdate.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Private link service proxy details.
 * 
 */
public final class PrivateLinkServiceProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceProxyArgs Empty = new PrivateLinkServiceProxyArgs();

    /**
     * Group connectivity information.
     * 
     */
    @InputImport(name="groupConnectivityInformation")
        private final @Nullable Input<List<GroupConnectivityInformationArgs>> groupConnectivityInformation;

    public Input<List<GroupConnectivityInformationArgs>> getGroupConnectivityInformation() {
        return this.groupConnectivityInformation == null ? Input.empty() : this.groupConnectivityInformation;
    }

    /**
     * NRP resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Remote private link service connection state
     * 
     */
    @InputImport(name="remotePrivateLinkServiceConnectionState")
        private final @Nullable Input<PrivateLinkServiceConnectionStateArgs> remotePrivateLinkServiceConnectionState;

    public Input<PrivateLinkServiceConnectionStateArgs> getRemotePrivateLinkServiceConnectionState() {
        return this.remotePrivateLinkServiceConnectionState == null ? Input.empty() : this.remotePrivateLinkServiceConnectionState;
    }

    public PrivateLinkServiceProxyArgs(
        @Nullable Input<List<GroupConnectivityInformationArgs>> groupConnectivityInformation,
        @Nullable Input<String> id,
        @Nullable Input<PrivateLinkServiceConnectionStateArgs> remotePrivateLinkServiceConnectionState) {
        this.groupConnectivityInformation = groupConnectivityInformation;
        this.id = id;
        this.remotePrivateLinkServiceConnectionState = remotePrivateLinkServiceConnectionState;
    }

    private PrivateLinkServiceProxyArgs() {
        this.groupConnectivityInformation = Input.empty();
        this.id = Input.empty();
        this.remotePrivateLinkServiceConnectionState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GroupConnectivityInformationArgs>> groupConnectivityInformation;
        private @Nullable Input<String> id;
        private @Nullable Input<PrivateLinkServiceConnectionStateArgs> remotePrivateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupConnectivityInformation = defaults.groupConnectivityInformation;
    	      this.id = defaults.id;
    	      this.remotePrivateLinkServiceConnectionState = defaults.remotePrivateLinkServiceConnectionState;
        }

        public Builder setGroupConnectivityInformation(@Nullable Input<List<GroupConnectivityInformationArgs>> groupConnectivityInformation) {
            this.groupConnectivityInformation = groupConnectivityInformation;
            return this;
        }

        public Builder setGroupConnectivityInformation(@Nullable List<GroupConnectivityInformationArgs> groupConnectivityInformation) {
            this.groupConnectivityInformation = Input.ofNullable(groupConnectivityInformation);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setRemotePrivateLinkServiceConnectionState(@Nullable Input<PrivateLinkServiceConnectionStateArgs> remotePrivateLinkServiceConnectionState) {
            this.remotePrivateLinkServiceConnectionState = remotePrivateLinkServiceConnectionState;
            return this;
        }

        public Builder setRemotePrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateArgs remotePrivateLinkServiceConnectionState) {
            this.remotePrivateLinkServiceConnectionState = Input.ofNullable(remotePrivateLinkServiceConnectionState);
            return this;
        }
        public PrivateLinkServiceProxyArgs build() {
            return new PrivateLinkServiceProxyArgs(groupConnectivityInformation, id, remotePrivateLinkServiceConnectionState);
        }
    }
}
