// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkgroupConfigurationEngineVersionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkgroupConfigurationEngineVersionGetArgs Empty = new WorkgroupConfigurationEngineVersionGetArgs();

    /**
     * The engine version on which the query runs. If `selected_engine_version` is set to `AUTO`, the effective engine version is chosen by Athena.
     * 
     */
    @InputImport(name="effectiveEngineVersion")
    private final @Nullable Input<String> effectiveEngineVersion;

    public Input<String> getEffectiveEngineVersion() {
        return this.effectiveEngineVersion == null ? Input.empty() : this.effectiveEngineVersion;
    }

    /**
     * The requested engine version. Defaults to `AUTO`.
     * 
     */
    @InputImport(name="selectedEngineVersion")
    private final @Nullable Input<String> selectedEngineVersion;

    public Input<String> getSelectedEngineVersion() {
        return this.selectedEngineVersion == null ? Input.empty() : this.selectedEngineVersion;
    }

    public WorkgroupConfigurationEngineVersionGetArgs(
        @Nullable Input<String> effectiveEngineVersion,
        @Nullable Input<String> selectedEngineVersion) {
        this.effectiveEngineVersion = effectiveEngineVersion;
        this.selectedEngineVersion = selectedEngineVersion;
    }

    private WorkgroupConfigurationEngineVersionGetArgs() {
        this.effectiveEngineVersion = Input.empty();
        this.selectedEngineVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkgroupConfigurationEngineVersionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> effectiveEngineVersion;
        private @Nullable Input<String> selectedEngineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkgroupConfigurationEngineVersionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveEngineVersion = defaults.effectiveEngineVersion;
    	      this.selectedEngineVersion = defaults.selectedEngineVersion;
        }

        public Builder setEffectiveEngineVersion(@Nullable Input<String> effectiveEngineVersion) {
            this.effectiveEngineVersion = effectiveEngineVersion;
            return this;
        }

        public Builder setEffectiveEngineVersion(@Nullable String effectiveEngineVersion) {
            this.effectiveEngineVersion = Input.ofNullable(effectiveEngineVersion);
            return this;
        }

        public Builder setSelectedEngineVersion(@Nullable Input<String> selectedEngineVersion) {
            this.selectedEngineVersion = selectedEngineVersion;
            return this;
        }

        public Builder setSelectedEngineVersion(@Nullable String selectedEngineVersion) {
            this.selectedEngineVersion = Input.ofNullable(selectedEngineVersion);
            return this;
        }
        public WorkgroupConfigurationEngineVersionGetArgs build() {
            return new WorkgroupConfigurationEngineVersionGetArgs(effectiveEngineVersion, selectedEngineVersion);
        }
    }
}
