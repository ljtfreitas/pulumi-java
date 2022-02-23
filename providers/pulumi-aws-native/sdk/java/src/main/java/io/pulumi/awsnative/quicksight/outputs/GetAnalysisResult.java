// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.AnalysisError;
import io.pulumi.awsnative.quicksight.outputs.AnalysisResourcePermission;
import io.pulumi.awsnative.quicksight.outputs.AnalysisTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAnalysisResult {
    /**
     * <p>The Amazon Resource Name (ARN) of the analysis.</p>
     * 
     */
    private final @Nullable String arn;
    /**
     * <p>The time that the analysis was created.</p>
     * 
     */
    private final @Nullable String createdTime;
    /**
     * <p>The ARNs of the datasets of the analysis.</p>
     * 
     */
    private final @Nullable List<String> dataSetArns;
    /**
     * <p>Errors associated with the analysis.</p>
     * 
     */
    private final @Nullable List<AnalysisError> errors;
    /**
     * <p>The descriptive name of the analysis.</p>
     * 
     */
    private final @Nullable String name;
    /**
     * <p>A structure that describes the principals and the resource-level permissions on an
     *             analysis. You can use the <code>Permissions</code> structure to grant permissions by
     *             providing a list of AWS Identity and Access Management (IAM) action information for each
     *             principal listed by Amazon Resource Name (ARN). </p>
     * 
     *         <p>To specify no permissions, omit <code>Permissions</code>.</p>
     * 
     */
    private final @Nullable List<AnalysisResourcePermission> permissions;
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the
     *             analysis.</p>
     * 
     */
    private final @Nullable List<AnalysisTag> tags;
    /**
     * <p>The ARN of the theme of the analysis.</p>
     * 
     */
    private final @Nullable String themeArn;

    @OutputCustomType.Constructor({"arn","createdTime","dataSetArns","errors","name","permissions","tags","themeArn"})
    private GetAnalysisResult(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable List<String> dataSetArns,
        @Nullable List<AnalysisError> errors,
        @Nullable String name,
        @Nullable List<AnalysisResourcePermission> permissions,
        @Nullable List<AnalysisTag> tags,
        @Nullable String themeArn) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.dataSetArns = dataSetArns;
        this.errors = errors;
        this.name = name;
        this.permissions = permissions;
        this.tags = tags;
        this.themeArn = themeArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the analysis.</p>
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * <p>The time that the analysis was created.</p>
     * 
     */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * <p>The ARNs of the datasets of the analysis.</p>
     * 
     */
    public List<String> getDataSetArns() {
        return this.dataSetArns == null ? List.of() : this.dataSetArns;
    }
    /**
     * <p>Errors associated with the analysis.</p>
     * 
     */
    public List<AnalysisError> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }
    /**
     * <p>The descriptive name of the analysis.</p>
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * <p>A structure that describes the principals and the resource-level permissions on an
     *             analysis. You can use the <code>Permissions</code> structure to grant permissions by
     *             providing a list of AWS Identity and Access Management (IAM) action information for each
     *             principal listed by Amazon Resource Name (ARN). </p>
     * 
     *         <p>To specify no permissions, omit <code>Permissions</code>.</p>
     * 
     */
    public List<AnalysisResourcePermission> getPermissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the
     *             analysis.</p>
     * 
     */
    public List<AnalysisTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * <p>The ARN of the theme of the analysis.</p>
     * 
     */
    public Optional<String> getThemeArn() {
        return Optional.ofNullable(this.themeArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnalysisResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable List<String> dataSetArns;
        private @Nullable List<AnalysisError> errors;
        private @Nullable String name;
        private @Nullable List<AnalysisResourcePermission> permissions;
        private @Nullable List<AnalysisTag> tags;
        private @Nullable String themeArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnalysisResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.dataSetArns = defaults.dataSetArns;
    	      this.errors = defaults.errors;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.tags = defaults.tags;
    	      this.themeArn = defaults.themeArn;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDataSetArns(@Nullable List<String> dataSetArns) {
            this.dataSetArns = dataSetArns;
            return this;
        }

        public Builder setErrors(@Nullable List<AnalysisError> errors) {
            this.errors = errors;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPermissions(@Nullable List<AnalysisResourcePermission> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setTags(@Nullable List<AnalysisTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setThemeArn(@Nullable String themeArn) {
            this.themeArn = themeArn;
            return this;
        }
        public GetAnalysisResult build() {
            return new GetAnalysisResult(arn, createdTime, dataSetArns, errors, name, permissions, tags, themeArn);
        }
    }
}
