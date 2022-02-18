// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a managed private endpoint
 * 
 */
public final class ManagedPrivateEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedPrivateEndpointArgs Empty = new ManagedPrivateEndpointArgs();

    /**
     * Fully qualified domain names
     * 
     */
    @InputImport(name="fqdns")
    private final @Nullable Input<List<String>> fqdns;

    public Input<List<String>> getFqdns() {
        return this.fqdns == null ? Input.empty() : this.fqdns;
    }

    /**
     * The groupId to which the managed private endpoint is created
     * 
     */
    @InputImport(name="groupId")
    private final @Nullable Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId == null ? Input.empty() : this.groupId;
    }

    /**
     * The ARM resource ID of the resource to which the managed private endpoint is created
     * 
     */
    @InputImport(name="privateLinkResourceId")
    private final @Nullable Input<String> privateLinkResourceId;

    public Input<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId == null ? Input.empty() : this.privateLinkResourceId;
    }

    public ManagedPrivateEndpointArgs(
        @Nullable Input<List<String>> fqdns,
        @Nullable Input<String> groupId,
        @Nullable Input<String> privateLinkResourceId) {
        this.fqdns = fqdns;
        this.groupId = groupId;
        this.privateLinkResourceId = privateLinkResourceId;
    }

    private ManagedPrivateEndpointArgs() {
        this.fqdns = Input.empty();
        this.groupId = Input.empty();
        this.privateLinkResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> fqdns;
        private @Nullable Input<String> groupId;
        private @Nullable Input<String> privateLinkResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdns = defaults.fqdns;
    	      this.groupId = defaults.groupId;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
        }

        public Builder setFqdns(@Nullable Input<List<String>> fqdns) {
            this.fqdns = fqdns;
            return this;
        }

        public Builder setFqdns(@Nullable List<String> fqdns) {
            this.fqdns = Input.ofNullable(fqdns);
            return this;
        }

        public Builder setGroupId(@Nullable Input<String> groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = Input.ofNullable(groupId);
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable Input<String> privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = Input.ofNullable(privateLinkResourceId);
            return this;
        }

        public ManagedPrivateEndpointArgs build() {
            return new ManagedPrivateEndpointArgs(fqdns, groupId, privateLinkResourceId);
        }
    }
}
