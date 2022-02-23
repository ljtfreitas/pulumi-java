// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceParametersAthena {
    /**
     * The work-group to which to connect.
     * 
     */
    private final @Nullable String workGroup;

    @OutputCustomType.Constructor({"workGroup"})
    private DataSourceParametersAthena(@Nullable String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * The work-group to which to connect.
     * 
     */
    public Optional<String> getWorkGroup() {
        return Optional.ofNullable(this.workGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAthena defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String workGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersAthena defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workGroup = defaults.workGroup;
        }

        public Builder setWorkGroup(@Nullable String workGroup) {
            this.workGroup = workGroup;
            return this;
        }
        public DataSourceParametersAthena build() {
            return new DataSourceParametersAthena(workGroup);
        }
    }
}
