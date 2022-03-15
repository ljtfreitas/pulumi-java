// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ReportGroupExportConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The date and time this Report Group was created.
     * 
     */
    @Import(name="created")
      private final @Nullable Output<String> created;

    public Output<String> getCreated() {
        return this.created == null ? Output.empty() : this.created;
    }

    /**
     * If `true`, deletes any reports that belong to a report group before deleting the report group. If `false`, you must delete any reports in the report group before deleting it. Default value is `false`.
     * 
     */
    @Import(name="deleteReports")
      private final @Nullable Output<Boolean> deleteReports;

    public Output<Boolean> getDeleteReports() {
        return this.deleteReports == null ? Output.empty() : this.deleteReports;
    }

    /**
     * Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
     * 
     */
    @Import(name="exportConfig")
      private final @Nullable Output<ReportGroupExportConfigGetArgs> exportConfig;

    public Output<ReportGroupExportConfigGetArgs> getExportConfig() {
        return this.exportConfig == null ? Output.empty() : this.exportConfig;
    }

    /**
     * The name of a Report Group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public ReportGroupState(
        @Nullable Output<String> arn,
        @Nullable Output<String> created,
        @Nullable Output<Boolean> deleteReports,
        @Nullable Output<ReportGroupExportConfigGetArgs> exportConfig,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> type) {
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
        this.arn = Output.empty();
        this.created = Output.empty();
        this.deleteReports = Output.empty();
        this.exportConfig = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> created;
        private @Nullable Output<Boolean> deleteReports;
        private @Nullable Output<ReportGroupExportConfigGetArgs> exportConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> type;

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

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder created(@Nullable Output<String> created) {
            this.created = created;
            return this;
        }

        public Builder created(@Nullable String created) {
            this.created = Output.ofNullable(created);
            return this;
        }

        public Builder deleteReports(@Nullable Output<Boolean> deleteReports) {
            this.deleteReports = deleteReports;
            return this;
        }

        public Builder deleteReports(@Nullable Boolean deleteReports) {
            this.deleteReports = Output.ofNullable(deleteReports);
            return this;
        }

        public Builder exportConfig(@Nullable Output<ReportGroupExportConfigGetArgs> exportConfig) {
            this.exportConfig = exportConfig;
            return this;
        }

        public Builder exportConfig(@Nullable ReportGroupExportConfigGetArgs exportConfig) {
            this.exportConfig = Output.ofNullable(exportConfig);
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public ReportGroupState build() {
            return new ReportGroupState(arn, created, deleteReports, exportConfig, name, tags, tagsAll, type);
        }
    }
}
