// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudasset.inputs.FolderFeedConditionGetArgs;
import io.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FolderFeedState extends io.pulumi.resources.ResourceArgs {

    public static final FolderFeedState Empty = new FolderFeedState();

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
    @Import(name="billingProject")
      private final @Nullable Output<String> billingProject;

    public Output<String> getBillingProject() {
        return this.billingProject == null ? Output.empty() : this.billingProject;
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
      private final @Nullable Output<FolderFeedConditionGetArgs> condition;

    public Output<FolderFeedConditionGetArgs> getCondition() {
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
    @Import(name="feedId")
      private final @Nullable Output<String> feedId;

    public Output<String> getFeedId() {
        return this.feedId == null ? Output.empty() : this.feedId;
    }

    /**
     * Output configuration for asset feed destination.
     * Structure is documented below.
     * 
     */
    @Import(name="feedOutputConfig")
      private final @Nullable Output<FolderFeedFeedOutputConfigGetArgs> feedOutputConfig;

    public Output<FolderFeedFeedOutputConfigGetArgs> getFeedOutputConfig() {
        return this.feedOutputConfig == null ? Output.empty() : this.feedOutputConfig;
    }

    /**
     * The folder this feed should be created in.
     * 
     */
    @Import(name="folder")
      private final @Nullable Output<String> folder;

    public Output<String> getFolder() {
        return this.folder == null ? Output.empty() : this.folder;
    }

    /**
     * The ID of the folder where this feed has been created. Both [FOLDER_NUMBER] and folders/[FOLDER_NUMBER] are accepted.
     * 
     */
    @Import(name="folderId")
      private final @Nullable Output<String> folderId;

    public Output<String> getFolderId() {
        return this.folderId == null ? Output.empty() : this.folderId;
    }

    /**
     * The format will be folders/{folder_number}/feeds/{client-assigned_feed_identifier}.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public FolderFeedState(
        @Nullable Output<List<String>> assetNames,
        @Nullable Output<List<String>> assetTypes,
        @Nullable Output<String> billingProject,
        @Nullable Output<FolderFeedConditionGetArgs> condition,
        @Nullable Output<String> contentType,
        @Nullable Output<String> feedId,
        @Nullable Output<FolderFeedFeedOutputConfigGetArgs> feedOutputConfig,
        @Nullable Output<String> folder,
        @Nullable Output<String> folderId,
        @Nullable Output<String> name) {
        this.assetNames = assetNames;
        this.assetTypes = assetTypes;
        this.billingProject = billingProject;
        this.condition = condition;
        this.contentType = contentType;
        this.feedId = feedId;
        this.feedOutputConfig = feedOutputConfig;
        this.folder = folder;
        this.folderId = folderId;
        this.name = name;
    }

    private FolderFeedState() {
        this.assetNames = Output.empty();
        this.assetTypes = Output.empty();
        this.billingProject = Output.empty();
        this.condition = Output.empty();
        this.contentType = Output.empty();
        this.feedId = Output.empty();
        this.feedOutputConfig = Output.empty();
        this.folder = Output.empty();
        this.folderId = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderFeedState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> assetNames;
        private @Nullable Output<List<String>> assetTypes;
        private @Nullable Output<String> billingProject;
        private @Nullable Output<FolderFeedConditionGetArgs> condition;
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> feedId;
        private @Nullable Output<FolderFeedFeedOutputConfigGetArgs> feedOutputConfig;
        private @Nullable Output<String> folder;
        private @Nullable Output<String> folderId;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderFeedState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetNames = defaults.assetNames;
    	      this.assetTypes = defaults.assetTypes;
    	      this.billingProject = defaults.billingProject;
    	      this.condition = defaults.condition;
    	      this.contentType = defaults.contentType;
    	      this.feedId = defaults.feedId;
    	      this.feedOutputConfig = defaults.feedOutputConfig;
    	      this.folder = defaults.folder;
    	      this.folderId = defaults.folderId;
    	      this.name = defaults.name;
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

        public Builder billingProject(@Nullable Output<String> billingProject) {
            this.billingProject = billingProject;
            return this;
        }

        public Builder billingProject(@Nullable String billingProject) {
            this.billingProject = Output.ofNullable(billingProject);
            return this;
        }

        public Builder condition(@Nullable Output<FolderFeedConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable FolderFeedConditionGetArgs condition) {
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

        public Builder feedId(@Nullable Output<String> feedId) {
            this.feedId = feedId;
            return this;
        }

        public Builder feedId(@Nullable String feedId) {
            this.feedId = Output.ofNullable(feedId);
            return this;
        }

        public Builder feedOutputConfig(@Nullable Output<FolderFeedFeedOutputConfigGetArgs> feedOutputConfig) {
            this.feedOutputConfig = feedOutputConfig;
            return this;
        }

        public Builder feedOutputConfig(@Nullable FolderFeedFeedOutputConfigGetArgs feedOutputConfig) {
            this.feedOutputConfig = Output.ofNullable(feedOutputConfig);
            return this;
        }

        public Builder folder(@Nullable Output<String> folder) {
            this.folder = folder;
            return this;
        }

        public Builder folder(@Nullable String folder) {
            this.folder = Output.ofNullable(folder);
            return this;
        }

        public Builder folderId(@Nullable Output<String> folderId) {
            this.folderId = folderId;
            return this;
        }

        public Builder folderId(@Nullable String folderId) {
            this.folderId = Output.ofNullable(folderId);
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
        public FolderFeedState build() {
            return new FolderFeedState(assetNames, assetTypes, billingProject, condition, contentType, feedId, feedOutputConfig, folder, folderId, name);
        }
    }
}
