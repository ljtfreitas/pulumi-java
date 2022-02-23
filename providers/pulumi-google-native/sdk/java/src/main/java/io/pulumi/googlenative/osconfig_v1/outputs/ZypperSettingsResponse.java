// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ZypperSettingsResponse {
    /**
     * Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
     */
    private final List<String> categories;
    /**
     * List of patches to exclude from update.
     * 
     */
    private final List<String> excludes;
    /**
     * An exclusive list of patches to be updated. These are the only patches that will be installed using 'zypper patch patch:' command. This field must not be used with any other patch configuration fields.
     * 
     */
    private final List<String> exclusivePatches;
    /**
     * Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
     */
    private final List<String> severities;
    /**
     * Adds the `--with-optional` flag to `zypper patch`.
     * 
     */
    private final Boolean withOptional;
    /**
     * Adds the `--with-update` flag, to `zypper patch`.
     * 
     */
    private final Boolean withUpdate;

    @OutputCustomType.Constructor({"categories","excludes","exclusivePatches","severities","withOptional","withUpdate"})
    private ZypperSettingsResponse(
        List<String> categories,
        List<String> excludes,
        List<String> exclusivePatches,
        List<String> severities,
        Boolean withOptional,
        Boolean withUpdate) {
        this.categories = Objects.requireNonNull(categories);
        this.excludes = Objects.requireNonNull(excludes);
        this.exclusivePatches = Objects.requireNonNull(exclusivePatches);
        this.severities = Objects.requireNonNull(severities);
        this.withOptional = Objects.requireNonNull(withOptional);
        this.withUpdate = Objects.requireNonNull(withUpdate);
    }

    /**
     * Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
     */
    public List<String> getCategories() {
        return this.categories;
    }
    /**
     * List of patches to exclude from update.
     * 
     */
    public List<String> getExcludes() {
        return this.excludes;
    }
    /**
     * An exclusive list of patches to be updated. These are the only patches that will be installed using 'zypper patch patch:' command. This field must not be used with any other patch configuration fields.
     * 
     */
    public List<String> getExclusivePatches() {
        return this.exclusivePatches;
    }
    /**
     * Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
     */
    public List<String> getSeverities() {
        return this.severities;
    }
    /**
     * Adds the `--with-optional` flag to `zypper patch`.
     * 
     */
    public Boolean getWithOptional() {
        return this.withOptional;
    }
    /**
     * Adds the `--with-update` flag, to `zypper patch`.
     * 
     */
    public Boolean getWithUpdate() {
        return this.withUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZypperSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> categories;
        private List<String> excludes;
        private List<String> exclusivePatches;
        private List<String> severities;
        private Boolean withOptional;
        private Boolean withUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(ZypperSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
    	      this.severities = defaults.severities;
    	      this.withOptional = defaults.withOptional;
    	      this.withUpdate = defaults.withUpdate;
        }

        public Builder setCategories(List<String> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }

        public Builder setExcludes(List<String> excludes) {
            this.excludes = Objects.requireNonNull(excludes);
            return this;
        }

        public Builder setExclusivePatches(List<String> exclusivePatches) {
            this.exclusivePatches = Objects.requireNonNull(exclusivePatches);
            return this;
        }

        public Builder setSeverities(List<String> severities) {
            this.severities = Objects.requireNonNull(severities);
            return this;
        }

        public Builder setWithOptional(Boolean withOptional) {
            this.withOptional = Objects.requireNonNull(withOptional);
            return this;
        }

        public Builder setWithUpdate(Boolean withUpdate) {
            this.withUpdate = Objects.requireNonNull(withUpdate);
            return this;
        }
        public ZypperSettingsResponse build() {
            return new ZypperSettingsResponse(categories, excludes, exclusivePatches, severities, withOptional, withUpdate);
        }
    }
}
