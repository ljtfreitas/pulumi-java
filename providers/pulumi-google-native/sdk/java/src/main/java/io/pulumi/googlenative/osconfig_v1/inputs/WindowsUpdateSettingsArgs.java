// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.enums.WindowsUpdateSettingsClassificationsItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Windows patching is performed using the Windows Update Agent.
 * 
 */
public final class WindowsUpdateSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsUpdateSettingsArgs Empty = new WindowsUpdateSettingsArgs();

    /**
     * Only apply updates of these windows update classifications. If empty, all updates are applied.
     * 
     */
    @InputImport(name="classifications")
      private final @Nullable Input<List<WindowsUpdateSettingsClassificationsItem>> classifications;

    public Input<List<WindowsUpdateSettingsClassificationsItem>> getClassifications() {
        return this.classifications == null ? Input.empty() : this.classifications;
    }

    /**
     * List of KBs to exclude from update.
     * 
     */
    @InputImport(name="excludes")
      private final @Nullable Input<List<String>> excludes;

    public Input<List<String>> getExcludes() {
        return this.excludes == null ? Input.empty() : this.excludes;
    }

    /**
     * An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
     * 
     */
    @InputImport(name="exclusivePatches")
      private final @Nullable Input<List<String>> exclusivePatches;

    public Input<List<String>> getExclusivePatches() {
        return this.exclusivePatches == null ? Input.empty() : this.exclusivePatches;
    }

    public WindowsUpdateSettingsArgs(
        @Nullable Input<List<WindowsUpdateSettingsClassificationsItem>> classifications,
        @Nullable Input<List<String>> excludes,
        @Nullable Input<List<String>> exclusivePatches) {
        this.classifications = classifications;
        this.excludes = excludes;
        this.exclusivePatches = exclusivePatches;
    }

    private WindowsUpdateSettingsArgs() {
        this.classifications = Input.empty();
        this.excludes = Input.empty();
        this.exclusivePatches = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsUpdateSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WindowsUpdateSettingsClassificationsItem>> classifications;
        private @Nullable Input<List<String>> excludes;
        private @Nullable Input<List<String>> exclusivePatches;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsUpdateSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classifications = defaults.classifications;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
        }

        public Builder setClassifications(@Nullable Input<List<WindowsUpdateSettingsClassificationsItem>> classifications) {
            this.classifications = classifications;
            return this;
        }

        public Builder setClassifications(@Nullable List<WindowsUpdateSettingsClassificationsItem> classifications) {
            this.classifications = Input.ofNullable(classifications);
            return this;
        }

        public Builder setExcludes(@Nullable Input<List<String>> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder setExcludes(@Nullable List<String> excludes) {
            this.excludes = Input.ofNullable(excludes);
            return this;
        }

        public Builder setExclusivePatches(@Nullable Input<List<String>> exclusivePatches) {
            this.exclusivePatches = exclusivePatches;
            return this;
        }

        public Builder setExclusivePatches(@Nullable List<String> exclusivePatches) {
            this.exclusivePatches = Input.ofNullable(exclusivePatches);
            return this;
        }
        public WindowsUpdateSettingsArgs build() {
            return new WindowsUpdateSettingsArgs(classifications, excludes, exclusivePatches);
        }
    }
}
