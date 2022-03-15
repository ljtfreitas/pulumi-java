// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.InterconnectInterconnectType;
import io.pulumi.googlenative.compute_alpha.enums.InterconnectLinkType;
import io.pulumi.googlenative.compute_alpha.inputs.InterconnectMacsecArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InterconnectArgs extends io.pulumi.resources.ResourceArgs {

    public static final InterconnectArgs Empty = new InterconnectArgs();

    /**
     * Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    @Import(name="adminEnabled")
      private final @Nullable Output<Boolean> adminEnabled;

    public Output<Boolean> getAdminEnabled() {
        return this.adminEnabled == null ? Output.empty() : this.adminEnabled;
    }

    /**
     * Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    @Import(name="customerName")
      private final @Nullable Output<String> customerName;

    public Output<String> getCustomerName() {
        return this.customerName == null ? Output.empty() : this.customerName;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    @Import(name="interconnectType")
      private final @Nullable Output<InterconnectInterconnectType> interconnectType;

    public Output<InterconnectInterconnectType> getInterconnectType() {
        return this.interconnectType == null ? Output.empty() : this.interconnectType;
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    @Import(name="linkType")
      private final @Nullable Output<InterconnectLinkType> linkType;

    public Output<InterconnectLinkType> getLinkType() {
        return this.linkType == null ? Output.empty() : this.linkType;
    }

    /**
     * URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Configuration to enable Media Access Control security (MACsec) on the Interconnect between Google and your on-premises router.
     * 
     */
    @Import(name="macsec")
      private final @Nullable Output<InterconnectMacsecArgs> macsec;

    public Output<InterconnectMacsecArgs> getMacsec() {
        return this.macsec == null ? Output.empty() : this.macsec;
    }

    /**
     * Enable or disable MACsec on this Interconnect. MACsec enablement will fail if the macsec object is not specified.
     * 
     */
    @Import(name="macsecEnabled")
      private final @Nullable Output<Boolean> macsecEnabled;

    public Output<Boolean> getMacsecEnabled() {
        return this.macsecEnabled == null ? Output.empty() : this.macsecEnabled;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    @Import(name="nocContactEmail")
      private final @Nullable Output<String> nocContactEmail;

    public Output<String> getNocContactEmail() {
        return this.nocContactEmail == null ? Output.empty() : this.nocContactEmail;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    @Import(name="requestedLinkCount")
      private final @Nullable Output<Integer> requestedLinkCount;

    public Output<Integer> getRequestedLinkCount() {
        return this.requestedLinkCount == null ? Output.empty() : this.requestedLinkCount;
    }

    public InterconnectArgs(
        @Nullable Output<Boolean> adminEnabled,
        @Nullable Output<String> customerName,
        @Nullable Output<String> description,
        @Nullable Output<InterconnectInterconnectType> interconnectType,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<InterconnectLinkType> linkType,
        @Nullable Output<String> location,
        @Nullable Output<InterconnectMacsecArgs> macsec,
        @Nullable Output<Boolean> macsecEnabled,
        @Nullable Output<String> name,
        @Nullable Output<String> nocContactEmail,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<Integer> requestedLinkCount) {
        this.adminEnabled = adminEnabled;
        this.customerName = customerName;
        this.description = description;
        this.interconnectType = interconnectType;
        this.labels = labels;
        this.linkType = linkType;
        this.location = location;
        this.macsec = macsec;
        this.macsecEnabled = macsecEnabled;
        this.name = name;
        this.nocContactEmail = nocContactEmail;
        this.project = project;
        this.requestId = requestId;
        this.requestedLinkCount = requestedLinkCount;
    }

    private InterconnectArgs() {
        this.adminEnabled = Output.empty();
        this.customerName = Output.empty();
        this.description = Output.empty();
        this.interconnectType = Output.empty();
        this.labels = Output.empty();
        this.linkType = Output.empty();
        this.location = Output.empty();
        this.macsec = Output.empty();
        this.macsecEnabled = Output.empty();
        this.name = Output.empty();
        this.nocContactEmail = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
        this.requestedLinkCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> adminEnabled;
        private @Nullable Output<String> customerName;
        private @Nullable Output<String> description;
        private @Nullable Output<InterconnectInterconnectType> interconnectType;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<InterconnectLinkType> linkType;
        private @Nullable Output<String> location;
        private @Nullable Output<InterconnectMacsecArgs> macsec;
        private @Nullable Output<Boolean> macsecEnabled;
        private @Nullable Output<String> name;
        private @Nullable Output<String> nocContactEmail;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<Integer> requestedLinkCount;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminEnabled = defaults.adminEnabled;
    	      this.customerName = defaults.customerName;
    	      this.description = defaults.description;
    	      this.interconnectType = defaults.interconnectType;
    	      this.labels = defaults.labels;
    	      this.linkType = defaults.linkType;
    	      this.location = defaults.location;
    	      this.macsec = defaults.macsec;
    	      this.macsecEnabled = defaults.macsecEnabled;
    	      this.name = defaults.name;
    	      this.nocContactEmail = defaults.nocContactEmail;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.requestedLinkCount = defaults.requestedLinkCount;
        }

        public Builder adminEnabled(@Nullable Output<Boolean> adminEnabled) {
            this.adminEnabled = adminEnabled;
            return this;
        }

        public Builder adminEnabled(@Nullable Boolean adminEnabled) {
            this.adminEnabled = Output.ofNullable(adminEnabled);
            return this;
        }

        public Builder customerName(@Nullable Output<String> customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder customerName(@Nullable String customerName) {
            this.customerName = Output.ofNullable(customerName);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder interconnectType(@Nullable Output<InterconnectInterconnectType> interconnectType) {
            this.interconnectType = interconnectType;
            return this;
        }

        public Builder interconnectType(@Nullable InterconnectInterconnectType interconnectType) {
            this.interconnectType = Output.ofNullable(interconnectType);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder linkType(@Nullable Output<InterconnectLinkType> linkType) {
            this.linkType = linkType;
            return this;
        }

        public Builder linkType(@Nullable InterconnectLinkType linkType) {
            this.linkType = Output.ofNullable(linkType);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder macsec(@Nullable Output<InterconnectMacsecArgs> macsec) {
            this.macsec = macsec;
            return this;
        }

        public Builder macsec(@Nullable InterconnectMacsecArgs macsec) {
            this.macsec = Output.ofNullable(macsec);
            return this;
        }

        public Builder macsecEnabled(@Nullable Output<Boolean> macsecEnabled) {
            this.macsecEnabled = macsecEnabled;
            return this;
        }

        public Builder macsecEnabled(@Nullable Boolean macsecEnabled) {
            this.macsecEnabled = Output.ofNullable(macsecEnabled);
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

        public Builder nocContactEmail(@Nullable Output<String> nocContactEmail) {
            this.nocContactEmail = nocContactEmail;
            return this;
        }

        public Builder nocContactEmail(@Nullable String nocContactEmail) {
            this.nocContactEmail = Output.ofNullable(nocContactEmail);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder requestedLinkCount(@Nullable Output<Integer> requestedLinkCount) {
            this.requestedLinkCount = requestedLinkCount;
            return this;
        }

        public Builder requestedLinkCount(@Nullable Integer requestedLinkCount) {
            this.requestedLinkCount = Output.ofNullable(requestedLinkCount);
            return this;
        }
        public InterconnectArgs build() {
            return new InterconnectArgs(adminEnabled, customerName, description, interconnectType, labels, linkType, location, macsec, macsecEnabled, name, nocContactEmail, project, requestId, requestedLinkCount);
        }
    }
}
