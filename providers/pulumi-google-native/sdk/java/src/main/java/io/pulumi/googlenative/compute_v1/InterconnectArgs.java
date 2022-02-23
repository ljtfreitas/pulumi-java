// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.InterconnectInterconnectType;
import io.pulumi.googlenative.compute_v1.enums.InterconnectLinkType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InterconnectArgs extends io.pulumi.resources.ResourceArgs {

    public static final InterconnectArgs Empty = new InterconnectArgs();

    /**
     * Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    @InputImport(name="adminEnabled")
      private final @Nullable Input<Boolean> adminEnabled;

    public Input<Boolean> getAdminEnabled() {
        return this.adminEnabled == null ? Input.empty() : this.adminEnabled;
    }

    /**
     * Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    @InputImport(name="customerName")
      private final @Nullable Input<String> customerName;

    public Input<String> getCustomerName() {
        return this.customerName == null ? Input.empty() : this.customerName;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    @InputImport(name="interconnectType")
      private final @Nullable Input<InterconnectInterconnectType> interconnectType;

    public Input<InterconnectInterconnectType> getInterconnectType() {
        return this.interconnectType == null ? Input.empty() : this.interconnectType;
    }

    /**
     * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    @InputImport(name="linkType")
      private final @Nullable Input<InterconnectLinkType> linkType;

    public Input<InterconnectLinkType> getLinkType() {
        return this.linkType == null ? Input.empty() : this.linkType;
    }

    /**
     * URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    @InputImport(name="nocContactEmail")
      private final @Nullable Input<String> nocContactEmail;

    public Input<String> getNocContactEmail() {
        return this.nocContactEmail == null ? Input.empty() : this.nocContactEmail;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    @InputImport(name="requestedLinkCount")
      private final @Nullable Input<Integer> requestedLinkCount;

    public Input<Integer> getRequestedLinkCount() {
        return this.requestedLinkCount == null ? Input.empty() : this.requestedLinkCount;
    }

    public InterconnectArgs(
        @Nullable Input<Boolean> adminEnabled,
        @Nullable Input<String> customerName,
        @Nullable Input<String> description,
        @Nullable Input<InterconnectInterconnectType> interconnectType,
        @Nullable Input<InterconnectLinkType> linkType,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> nocContactEmail,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<Integer> requestedLinkCount) {
        this.adminEnabled = adminEnabled;
        this.customerName = customerName;
        this.description = description;
        this.interconnectType = interconnectType;
        this.linkType = linkType;
        this.location = location;
        this.name = name;
        this.nocContactEmail = nocContactEmail;
        this.project = project;
        this.requestId = requestId;
        this.requestedLinkCount = requestedLinkCount;
    }

    private InterconnectArgs() {
        this.adminEnabled = Input.empty();
        this.customerName = Input.empty();
        this.description = Input.empty();
        this.interconnectType = Input.empty();
        this.linkType = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.nocContactEmail = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.requestedLinkCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> adminEnabled;
        private @Nullable Input<String> customerName;
        private @Nullable Input<String> description;
        private @Nullable Input<InterconnectInterconnectType> interconnectType;
        private @Nullable Input<InterconnectLinkType> linkType;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> nocContactEmail;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<Integer> requestedLinkCount;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminEnabled = defaults.adminEnabled;
    	      this.customerName = defaults.customerName;
    	      this.description = defaults.description;
    	      this.interconnectType = defaults.interconnectType;
    	      this.linkType = defaults.linkType;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nocContactEmail = defaults.nocContactEmail;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.requestedLinkCount = defaults.requestedLinkCount;
        }

        public Builder setAdminEnabled(@Nullable Input<Boolean> adminEnabled) {
            this.adminEnabled = adminEnabled;
            return this;
        }

        public Builder setAdminEnabled(@Nullable Boolean adminEnabled) {
            this.adminEnabled = Input.ofNullable(adminEnabled);
            return this;
        }

        public Builder setCustomerName(@Nullable Input<String> customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setCustomerName(@Nullable String customerName) {
            this.customerName = Input.ofNullable(customerName);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setInterconnectType(@Nullable Input<InterconnectInterconnectType> interconnectType) {
            this.interconnectType = interconnectType;
            return this;
        }

        public Builder setInterconnectType(@Nullable InterconnectInterconnectType interconnectType) {
            this.interconnectType = Input.ofNullable(interconnectType);
            return this;
        }

        public Builder setLinkType(@Nullable Input<InterconnectLinkType> linkType) {
            this.linkType = linkType;
            return this;
        }

        public Builder setLinkType(@Nullable InterconnectLinkType linkType) {
            this.linkType = Input.ofNullable(linkType);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNocContactEmail(@Nullable Input<String> nocContactEmail) {
            this.nocContactEmail = nocContactEmail;
            return this;
        }

        public Builder setNocContactEmail(@Nullable String nocContactEmail) {
            this.nocContactEmail = Input.ofNullable(nocContactEmail);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setRequestedLinkCount(@Nullable Input<Integer> requestedLinkCount) {
            this.requestedLinkCount = requestedLinkCount;
            return this;
        }

        public Builder setRequestedLinkCount(@Nullable Integer requestedLinkCount) {
            this.requestedLinkCount = Input.ofNullable(requestedLinkCount);
            return this;
        }
        public InterconnectArgs build() {
            return new InterconnectArgs(adminEnabled, customerName, description, interconnectType, linkType, location, name, nocContactEmail, project, requestId, requestedLinkCount);
        }
    }
}
