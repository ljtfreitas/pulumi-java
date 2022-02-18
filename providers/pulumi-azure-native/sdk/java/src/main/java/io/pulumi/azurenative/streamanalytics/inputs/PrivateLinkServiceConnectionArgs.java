// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A grouping of information about the connection to the remote resource.
 * 
 */
public final class PrivateLinkServiceConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionArgs Empty = new PrivateLinkServiceConnectionArgs();

    /**
     * The ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to. Required on PUT (CreateOrUpdate) requests.
     * 
     */
    @InputImport(name="groupIds")
    private final @Nullable Input<List<String>> groupIds;

    public Input<List<String>> getGroupIds() {
        return this.groupIds == null ? Input.empty() : this.groupIds;
    }

    /**
     * The resource id of the private link service. Required on PUT (CreateOrUpdate) requests.
     * 
     */
    @InputImport(name="privateLinkServiceId")
    private final @Nullable Input<String> privateLinkServiceId;

    public Input<String> getPrivateLinkServiceId() {
        return this.privateLinkServiceId == null ? Input.empty() : this.privateLinkServiceId;
    }

    /**
     * A message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     * 
     */
    @InputImport(name="requestMessage")
    private final @Nullable Input<String> requestMessage;

    public Input<String> getRequestMessage() {
        return this.requestMessage == null ? Input.empty() : this.requestMessage;
    }

    public PrivateLinkServiceConnectionArgs(
        @Nullable Input<List<String>> groupIds,
        @Nullable Input<String> privateLinkServiceId,
        @Nullable Input<String> requestMessage) {
        this.groupIds = groupIds;
        this.privateLinkServiceId = privateLinkServiceId;
        this.requestMessage = requestMessage;
    }

    private PrivateLinkServiceConnectionArgs() {
        this.groupIds = Input.empty();
        this.privateLinkServiceId = Input.empty();
        this.requestMessage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> groupIds;
        private @Nullable Input<String> privateLinkServiceId;
        private @Nullable Input<String> requestMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.privateLinkServiceId = defaults.privateLinkServiceId;
    	      this.requestMessage = defaults.requestMessage;
        }

        public Builder setGroupIds(@Nullable Input<List<String>> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder setGroupIds(@Nullable List<String> groupIds) {
            this.groupIds = Input.ofNullable(groupIds);
            return this;
        }

        public Builder setPrivateLinkServiceId(@Nullable Input<String> privateLinkServiceId) {
            this.privateLinkServiceId = privateLinkServiceId;
            return this;
        }

        public Builder setPrivateLinkServiceId(@Nullable String privateLinkServiceId) {
            this.privateLinkServiceId = Input.ofNullable(privateLinkServiceId);
            return this;
        }

        public Builder setRequestMessage(@Nullable Input<String> requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = Input.ofNullable(requestMessage);
            return this;
        }

        public PrivateLinkServiceConnectionArgs build() {
            return new PrivateLinkServiceConnectionArgs(groupIds, privateLinkServiceId, requestMessage);
        }
    }
}
