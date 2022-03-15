// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudasset.inputs.OrganizationFeedConditionArgs;
import io.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationFeedArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationFeedArgs Empty = new OrganizationFeedArgs();

    /**
     * A list of the full names of the assets to receive updates. You must specify either or both of
     * assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
     * exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
     * See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
     * 
     */
    @Import(name="assetNames")
      private final @Nullable Output<List<String>> assetNames;

    public Output<List<String>> getAssetNames() {
        return this.assetNames == null ? Output.empty() : this.assetNames;
    }

    /**
     * A list of types of the assets to receive updates. You must specify either or both of assetNames
     * and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
     * the feed. For example: "compute.googleapis.com/Disk"
     * See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
     * supported asset types.
     * 
     */
    @Import(name="assetTypes")
      private final @Nullable Output<List<String>> assetTypes;

    public Output<List<String>> getAssetTypes() {
        return this.assetTypes == null ? Output.empty() : this.assetTypes;
    }

    /**
     * The project whose identity will be used when sending messages to the
     * destination pubsub topic. It also specifies the project for API
     * enablement check, quota, and billing.
     * 
     */
    @Import(name="billingProject", required=true)
      private final Output<String> billingProject;

    public Output<String> getBillingProject() {
        return this.billingProject;
    }

    /**
     * A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression "temporal_asset.deleted == true" will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<OrganizationFeedConditionArgs> condition;

    public Output<OrganizationFeedConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * Asset content type. If not specified, no content but the asset name and type will be returned.
     * Possible values are `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, and `ACCESS_POLICY`.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Output.empty() : this.contentType;
    }

    /**
     * This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
     * 
     */
    @Import(name="feedId", required=true)
      private final Output<String> feedId;

    public Output<String> getFeedId() {
        return this.feedId;
    }

    /**
     * Output configuration for asset feed destination.
     * Structure is documented below.
     * 
     */
    @Import(name="feedOutputConfig", required=true)
      private final Output<OrganizationFeedFeedOutputConfigArgs> feedOutputConfig;

    public Output<OrganizationFeedFeedOutputConfigArgs> getFeedOutputConfig() {
        return this.feedOutputConfig;
    }

    /**
     * The organization this feed should be created in.
     * 
     */
    @Import(name="orgId", required=true)
      private final Output<String> orgId;

    public Output<String> getOrgId() {
        return this.orgId;
    }

    public OrganizationFeedArgs(
        @Nullable Output<List<String>> assetNames,
        @Nullable Output<List<String>> assetTypes,
        Output<String> billingProject,
        @Nullable Output<OrganizationFeedConditionArgs> condition,
        @Nullable Output<String> contentType,
        Output<String> feedId,
        Output<OrganizationFeedFeedOutputConfigArgs> feedOutputConfig,
        Output<String> orgId) {
        this.assetNames = assetNames;
        this.assetTypes = assetTypes;
        this.billingProject = Objects.requireNonNull(billingProject, "expected parameter 'billingProject' to be non-null");
        this.condition = condition;
        this.contentType = contentType;
        this.feedId = Objects.requireNonNull(feedId, "expected parameter 'feedId' to be non-null");
        this.feedOutputConfig = Objects.requireNonNull(feedOutputConfig, "expected parameter 'feedOutputConfig' to be non-null");
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
    }

    private OrganizationFeedArgs() {
        this.assetNames = Output.empty();
        this.assetTypes = Output.empty();
        this.billingProject = Output.empty();
        this.condition = Output.empty();
        this.contentType = Output.empty();
        this.feedId = Output.empty();
        this.feedOutputConfig = Output.empty();
        this.orgId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationFeedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> assetNames;
        private @Nullable Output<List<String>> assetTypes;
        private Output<String> billingProject;
        private @Nullable Output<OrganizationFeedConditionArgs> condition;
        private @Nullable Output<String> contentType;
        private Output<String> feedId;
        private Output<OrganizationFeedFeedOutputConfigArgs> feedOutputConfig;
        private Output<String> orgId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationFeedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetNames = defaults.assetNames;
    	      this.assetTypes = defaults.assetTypes;
    	      this.billingProject = defaults.billingProject;
    	      this.condition = defaults.condition;
    	      this.contentType = defaults.contentType;
    	      this.feedId = defaults.feedId;
    	      this.feedOutputConfig = defaults.feedOutputConfig;
    	      this.orgId = defaults.orgId;
        }

        public Builder assetNames(@Nullable Output<List<String>> assetNames) {
            this.assetNames = assetNames;
            return this;
        }

        public Builder assetNames(@Nullable List<String> assetNames) {
            this.assetNames = Output.ofNullable(assetNames);
            return this;
        }

        public Builder assetTypes(@Nullable Output<List<String>> assetTypes) {
            this.assetTypes = assetTypes;
            return this;
        }

        public Builder assetTypes(@Nullable List<String> assetTypes) {
            this.assetTypes = Output.ofNullable(assetTypes);
            return this;
        }

        public Builder billingProject(Output<String> billingProject) {
            this.billingProject = Objects.requireNonNull(billingProject);
            return this;
        }

        public Builder billingProject(String billingProject) {
            this.billingProject = Output.of(Objects.requireNonNull(billingProject));
            return this;
        }

        public Builder condition(@Nullable Output<OrganizationFeedConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable OrganizationFeedConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder contentType(@Nullable String contentType) {
            this.contentType = Output.ofNullable(contentType);
            return this;
        }

        public Builder feedId(Output<String> feedId) {
            this.feedId = Objects.requireNonNull(feedId);
            return this;
        }

        public Builder feedId(String feedId) {
            this.feedId = Output.of(Objects.requireNonNull(feedId));
            return this;
        }

        public Builder feedOutputConfig(Output<OrganizationFeedFeedOutputConfigArgs> feedOutputConfig) {
            this.feedOutputConfig = Objects.requireNonNull(feedOutputConfig);
            return this;
        }

        public Builder feedOutputConfig(OrganizationFeedFeedOutputConfigArgs feedOutputConfig) {
            this.feedOutputConfig = Output.of(Objects.requireNonNull(feedOutputConfig));
            return this;
        }

        public Builder orgId(Output<String> orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }

        public Builder orgId(String orgId) {
            this.orgId = Output.of(Objects.requireNonNull(orgId));
            return this;
        }
        public OrganizationFeedArgs build() {
            return new OrganizationFeedArgs(assetNames, assetTypes, billingProject, condition, contentType, feedId, feedOutputConfig, orgId);
        }
    }
}
