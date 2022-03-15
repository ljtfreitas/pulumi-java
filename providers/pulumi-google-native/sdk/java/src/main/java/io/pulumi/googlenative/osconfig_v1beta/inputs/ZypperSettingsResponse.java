// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Zypper patching is performed by running `zypper patch`. See also https://en.opensuse.org/SDB:Zypper_manual.
 * 
 */
public final class ZypperSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ZypperSettingsResponse Empty = new ZypperSettingsResponse();

    /**
     * Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
     */
    @Import(name="categories", required=true)
      private final List<String> categories;

    public List<String> getCategories() {
        return this.categories;
    }

    /**
     * List of patches to exclude from update.
     * 
     */
    @Import(name="excludes", required=true)
      private final List<String> excludes;

    public List<String> getExcludes() {
        return this.excludes;
    }

    /**
     * An exclusive list of patches to be updated. These are the only patches that will be installed using 'zypper patch patch:' command. This field must not be used with any other patch configuration fields.
     * 
     */
    @Import(name="exclusivePatches", required=true)
      private final List<String> exclusivePatches;

    public List<String> getExclusivePatches() {
        return this.exclusivePatches;
    }

    /**
     * Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
     */
    @Import(name="severities", required=true)
      private final List<String> severities;

    public List<String> getSeverities() {
        return this.severities;
    }

    /**
     * Adds the `--with-optional` flag to `zypper patch`.
     * 
     */
    @Import(name="withOptional", required=true)
      private final Boolean withOptional;

    public Boolean getWithOptional() {
        return this.withOptional;
    }

    /**
     * Adds the `--with-update` flag, to `zypper patch`.
     * 
     */
    @Import(name="withUpdate", required=true)
      private final Boolean withUpdate;

    public Boolean getWithUpdate() {
        return this.withUpdate;
    }

    public ZypperSettingsResponse(
        List<String> categories,
        List<String> excludes,
        List<String> exclusivePatches,
        List<String> severities,
        Boolean withOptional,
        Boolean withUpdate) {
        this.categories = Objects.requireNonNull(categories, "expected parameter 'categories' to be non-null");
        this.excludes = Objects.requireNonNull(excludes, "expected parameter 'excludes' to be non-null");
        this.exclusivePatches = Objects.requireNonNull(exclusivePatches, "expected parameter 'exclusivePatches' to be non-null");
        this.severities = Objects.requireNonNull(severities, "expected parameter 'severities' to be non-null");
        this.withOptional = Objects.requireNonNull(withOptional, "expected parameter 'withOptional' to be non-null");
        this.withUpdate = Objects.requireNonNull(withUpdate, "expected parameter 'withUpdate' to be non-null");
    }

    private ZypperSettingsResponse() {
        this.categories = List.of();
        this.excludes = List.of();
        this.exclusivePatches = List.of();
        this.severities = List.of();
        this.withOptional = null;
        this.withUpdate = null;
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

        public Builder categories(List<String> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }

        public Builder excludes(List<String> excludes) {
            this.excludes = Objects.requireNonNull(excludes);
            return this;
        }

        public Builder exclusivePatches(List<String> exclusivePatches) {
            this.exclusivePatches = Objects.requireNonNull(exclusivePatches);
            return this;
        }

        public Builder severities(List<String> severities) {
            this.severities = Objects.requireNonNull(severities);
            return this;
        }

        public Builder withOptional(Boolean withOptional) {
            this.withOptional = Objects.requireNonNull(withOptional);
            return this;
        }

        public Builder withUpdate(Boolean withUpdate) {
            this.withUpdate = Objects.requireNonNull(withUpdate);
            return this;
        }
        public ZypperSettingsResponse build() {
            return new ZypperSettingsResponse(categories, excludes, exclusivePatches, severities, withOptional, withUpdate);
        }
    }
}
