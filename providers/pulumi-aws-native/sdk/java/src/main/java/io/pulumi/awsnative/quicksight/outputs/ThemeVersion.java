// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.ThemeResourceStatus;
import io.pulumi.awsnative.quicksight.outputs.ThemeConfiguration;
import io.pulumi.awsnative.quicksight.outputs.ThemeError;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ThemeVersion {
    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    private final @Nullable String arn;
    /**
     * <p>The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All
     *             themes initially inherit from a default QuickSight theme.</p>
     * 
     */
    private final @Nullable String baseThemeId;
    private final @Nullable ThemeConfiguration configuration;
    /**
     * <p>The date and time that this theme version was created.</p>
     * 
     */
    private final @Nullable String createdTime;
    /**
     * <p>The description of the theme.</p>
     * 
     */
    private final @Nullable String description;
    /**
     * <p>Errors associated with the theme.</p>
     * 
     */
    private final @Nullable List<ThemeError> errors;
    private final @Nullable ThemeResourceStatus status;
    /**
     * <p>The version number of the theme.</p>
     * 
     */
    private final @Nullable Double versionNumber;

    @OutputCustomType.Constructor({"arn","baseThemeId","configuration","createdTime","description","errors","status","versionNumber"})
    private ThemeVersion(
        @Nullable String arn,
        @Nullable String baseThemeId,
        @Nullable ThemeConfiguration configuration,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable List<ThemeError> errors,
        @Nullable ThemeResourceStatus status,
        @Nullable Double versionNumber) {
        this.arn = arn;
        this.baseThemeId = baseThemeId;
        this.configuration = configuration;
        this.createdTime = createdTime;
        this.description = description;
        this.errors = errors;
        this.status = status;
        this.versionNumber = versionNumber;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * <p>The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All
     *             themes initially inherit from a default QuickSight theme.</p>
     * 
     */
    public Optional<String> getBaseThemeId() {
        return Optional.ofNullable(this.baseThemeId);
    }
    public Optional<ThemeConfiguration> getConfiguration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * <p>The date and time that this theme version was created.</p>
     * 
     */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * <p>The description of the theme.</p>
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * <p>Errors associated with the theme.</p>
     * 
     */
    public List<ThemeError> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }
    public Optional<ThemeResourceStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * <p>The version number of the theme.</p>
     * 
     */
    public Optional<Double> getVersionNumber() {
        return Optional.ofNullable(this.versionNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String baseThemeId;
        private @Nullable ThemeConfiguration configuration;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable List<ThemeError> errors;
        private @Nullable ThemeResourceStatus status;
        private @Nullable Double versionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.baseThemeId = defaults.baseThemeId;
    	      this.configuration = defaults.configuration;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.errors = defaults.errors;
    	      this.status = defaults.status;
    	      this.versionNumber = defaults.versionNumber;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setBaseThemeId(@Nullable String baseThemeId) {
            this.baseThemeId = baseThemeId;
            return this;
        }

        public Builder setConfiguration(@Nullable ThemeConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setErrors(@Nullable List<ThemeError> errors) {
            this.errors = errors;
            return this;
        }

        public Builder setStatus(@Nullable ThemeResourceStatus status) {
            this.status = status;
            return this;
        }

        public Builder setVersionNumber(@Nullable Double versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public ThemeVersion build() {
            return new ThemeVersion(arn, baseThemeId, configuration, createdTime, description, errors, status, versionNumber);
        }
    }
}
