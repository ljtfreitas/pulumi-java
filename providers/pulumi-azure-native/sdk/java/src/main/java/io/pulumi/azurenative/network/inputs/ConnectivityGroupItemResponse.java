// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectivityGroupItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectivityGroupItemResponse Empty = new ConnectivityGroupItemResponse();

    /**
     * Group connectivity type.
     * 
     */
    @Import(name="groupConnectivity")
      private final @Nullable String groupConnectivity;

    public Optional<String> getGroupConnectivity() {
        return this.groupConnectivity == null ? Optional.empty() : Optional.ofNullable(this.groupConnectivity);
    }

    /**
     * Flag if global is supported.
     * 
     */
    @Import(name="isGlobal")
      private final @Nullable String isGlobal;

    public Optional<String> getIsGlobal() {
        return this.isGlobal == null ? Optional.empty() : Optional.ofNullable(this.isGlobal);
    }

    /**
     * Network group Id.
     * 
     */
    @Import(name="networkGroupId")
      private final @Nullable String networkGroupId;

    public Optional<String> getNetworkGroupId() {
        return this.networkGroupId == null ? Optional.empty() : Optional.ofNullable(this.networkGroupId);
    }

    /**
     * Flag if need to use hub gateway.
     * 
     */
    @Import(name="useHubGateway")
      private final @Nullable String useHubGateway;

    public Optional<String> getUseHubGateway() {
        return this.useHubGateway == null ? Optional.empty() : Optional.ofNullable(this.useHubGateway);
    }

    public ConnectivityGroupItemResponse(
        @Nullable String groupConnectivity,
        @Nullable String isGlobal,
        @Nullable String networkGroupId,
        @Nullable String useHubGateway) {
        this.groupConnectivity = groupConnectivity;
        this.isGlobal = isGlobal;
        this.networkGroupId = networkGroupId;
        this.useHubGateway = useHubGateway;
    }

    private ConnectivityGroupItemResponse() {
        this.groupConnectivity = null;
        this.isGlobal = null;
        this.networkGroupId = null;
        this.useHubGateway = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityGroupItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupConnectivity;
        private @Nullable String isGlobal;
        private @Nullable String networkGroupId;
        private @Nullable String useHubGateway;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectivityGroupItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupConnectivity = defaults.groupConnectivity;
    	      this.isGlobal = defaults.isGlobal;
    	      this.networkGroupId = defaults.networkGroupId;
    	      this.useHubGateway = defaults.useHubGateway;
        }

        public Builder groupConnectivity(@Nullable String groupConnectivity) {
            this.groupConnectivity = groupConnectivity;
            return this;
        }

        public Builder isGlobal(@Nullable String isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder networkGroupId(@Nullable String networkGroupId) {
            this.networkGroupId = networkGroupId;
            return this;
        }

        public Builder useHubGateway(@Nullable String useHubGateway) {
            this.useHubGateway = useHubGateway;
            return this;
        }
        public ConnectivityGroupItemResponse build() {
            return new ConnectivityGroupItemResponse(groupConnectivity, isGlobal, networkGroupId, useHubGateway);
        }
    }
}
