// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Private endpoint connection proxy object properties.
 * 
 */
public final class ConnectionDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionDetailsResponse Empty = new ConnectionDetailsResponse();

    /**
     * Group ID.
     * 
     */
    @InputImport(name="groupId", required=true)
        private final String groupId;

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Connection details ID.
     * 
     */
    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Link ID.
     * 
     */
    @InputImport(name="linkIdentifier", required=true)
        private final String linkIdentifier;

    public String getLinkIdentifier() {
        return this.linkIdentifier;
    }

    /**
     * Member name.
     * 
     */
    @InputImport(name="memberName", required=true)
        private final String memberName;

    public String getMemberName() {
        return this.memberName;
    }

    /**
     * Private IP address.
     * 
     */
    @InputImport(name="privateIpAddress", required=true)
        private final String privateIpAddress;

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public ConnectionDetailsResponse(
        String groupId,
        String id,
        String linkIdentifier,
        String memberName,
        String privateIpAddress) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.linkIdentifier = Objects.requireNonNull(linkIdentifier, "expected parameter 'linkIdentifier' to be non-null");
        this.memberName = Objects.requireNonNull(memberName, "expected parameter 'memberName' to be non-null");
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
    }

    private ConnectionDetailsResponse() {
        this.groupId = null;
        this.id = null;
        this.linkIdentifier = null;
        this.memberName = null;
        this.privateIpAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupId;
        private String id;
        private String linkIdentifier;
        private String memberName;
        private String privateIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.linkIdentifier = defaults.linkIdentifier;
    	      this.memberName = defaults.memberName;
    	      this.privateIpAddress = defaults.privateIpAddress;
        }

        public Builder setGroupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLinkIdentifier(String linkIdentifier) {
            this.linkIdentifier = Objects.requireNonNull(linkIdentifier);
            return this;
        }

        public Builder setMemberName(String memberName) {
            this.memberName = Objects.requireNonNull(memberName);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        public ConnectionDetailsResponse build() {
            return new ConnectionDetailsResponse(groupId, id, linkIdentifier, memberName, privateIpAddress);
        }
    }
}
