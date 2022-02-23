// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ReportGroupExportConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportGroupState extends io.pulumi.resources.ResourceArgs {

    public static final ReportGroupState Empty = new ReportGroupState();

    /**
     * The ARN of Report Group.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The date and time this Report Group was created.
     * 
     */
    @InputImport(name="created")
    private final @Nullable Input<String> created;

    public Input<String> getCreated() {
        return this.created == null ? Input.empty() : this.created;
    }

    /**
     * If `true`, deletes any reports that belong to a report group before deleting the report group. If `false`, you must delete any reports in the report group before deleting it. Default value is `false`.
     * 
     */
    @InputImport(name="deleteReports")
    private final @Nullable Input<Boolean> deleteReports;

    public Input<Boolean> getDeleteReports() {
        return this.deleteReports == null ? Input.empty() : this.deleteReports;
    }

    /**
     * Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
     * 
     */
    @InputImport(name="exportConfig")
    private final @Nullable Input<ReportGroupExportConfigGetArgs> exportConfig;

    public Input<ReportGroupExportConfigGetArgs> getExportConfig() {
        return this.exportConfig == null ? Input.empty() : this.exportConfig;
    }

    /**
     * The name of a Report Group.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ReportGroupState(
        @Nullable Input<String> arn,
        @Nullable Input<String> created,
        @Nullable Input<Boolean> deleteReports,
        @Nullable Input<ReportGroupExportConfigGetArgs> exportConfig,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> type) {
        this.arn = arn;
        this.created = created;
        this.deleteReports = deleteReports;
        this.exportConfig = exportConfig;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
    }

    private ReportGroupState() {
        this.arn = Input.empty();
        this.created = Input.empty();
        this.deleteReports = Input.empty();
        this.exportConfig = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> created;
        private @Nullable Input<Boolean> deleteReports;
        private @Nullable Input<ReportGroupExportConfigGetArgs> exportConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.created = defaults.created;
    	      this.deleteReports = defaults.deleteReports;
    	      this.exportConfig = defaults.exportConfig;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCreated(@Nullable Input<String> created) {
            this.created = created;
            return this;
        }

        public Builder setCreated(@Nullable String created) {
            this.created = Input.ofNullable(created);
            return this;
        }

        public Builder setDeleteReports(@Nullable Input<Boolean> deleteReports) {
            this.deleteReports = deleteReports;
            return this;
        }

        public Builder setDeleteReports(@Nullable Boolean deleteReports) {
            this.deleteReports = Input.ofNullable(deleteReports);
            return this;
        }

        public Builder setExportConfig(@Nullable Input<ReportGroupExportConfigGetArgs> exportConfig) {
            this.exportConfig = exportConfig;
            return this;
        }

        public Builder setExportConfig(@Nullable ReportGroupExportConfigGetArgs exportConfig) {
            this.exportConfig = Input.ofNullable(exportConfig);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ReportGroupState build() {
            return new ReportGroupState(arn, created, deleteReports, exportConfig, name, tags, tagsAll, type);
        }
    }
}
