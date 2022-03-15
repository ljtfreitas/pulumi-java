// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GcpUserAccessBindingState extends io.pulumi.resources.ResourceArgs {

    public static final GcpUserAccessBindingState Empty = new GcpUserAccessBindingState();

    /**
     * Required. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: "accessPolicies/9522/accessLevels/device_trusted"
     * 
     */
    @Import(name="accessLevels")
      private final @Nullable Output<String> accessLevels;

    public Output<String> getAccessLevels() {
        return this.accessLevels == null ? Output.empty() : this.accessLevels;
    }

    /**
     * Required. Immutable. Google Group id whose members are subject to this binding's restrictions. See "id" in the G Suite Directory API's Groups resource. If a group's email address/alias is changed, this resource will continue to point at the changed group. This field does not accept group email addresses or aliases. Example: "01d520gv4vjcrht"
     * 
     */
    @Import(name="groupKey")
      private final @Nullable Output<String> groupKey;

    public Output<String> getGroupKey() {
        return this.groupKey == null ? Output.empty() : this.groupKey;
    }

    /**
     * Immutable. Assigned by the server during creation. The last segment has an arbitrary length and has only URI unreserved
     * characters (as defined by RFC 3986 Section 2.3). Should not be specified by the client during creation. Example:
     * "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Required. ID of the parent organization.
     * 
     */
    @Import(name="organizationId")
      private final @Nullable Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId == null ? Output.empty() : this.organizationId;
    }

    public GcpUserAccessBindingState(
        @Nullable Output<String> accessLevels,
        @Nullable Output<String> groupKey,
        @Nullable Output<String> name,
        @Nullable Output<String> organizationId) {
        this.accessLevels = accessLevels;
        this.groupKey = groupKey;
        this.name = name;
        this.organizationId = organizationId;
    }

    private GcpUserAccessBindingState() {
        this.accessLevels = Output.empty();
        this.groupKey = Output.empty();
        this.name = Output.empty();
        this.organizationId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpUserAccessBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessLevels;
        private @Nullable Output<String> groupKey;
        private @Nullable Output<String> name;
        private @Nullable Output<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GcpUserAccessBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.groupKey = defaults.groupKey;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder accessLevels(@Nullable Output<String> accessLevels) {
            this.accessLevels = accessLevels;
            return this;
        }

        public Builder accessLevels(@Nullable String accessLevels) {
            this.accessLevels = Output.ofNullable(accessLevels);
            return this;
        }

        public Builder groupKey(@Nullable Output<String> groupKey) {
            this.groupKey = groupKey;
            return this;
        }

        public Builder groupKey(@Nullable String groupKey) {
            this.groupKey = Output.ofNullable(groupKey);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder organizationId(@Nullable Output<String> organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(@Nullable String organizationId) {
            this.organizationId = Output.ofNullable(organizationId);
            return this;
        }
        public GcpUserAccessBindingState build() {
            return new GcpUserAccessBindingState(accessLevels, groupKey, name, organizationId);
        }
    }
}
