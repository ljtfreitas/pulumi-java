// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The order by expression to be used in the report.
 * 
 */
public final class ReportConfigSortingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportConfigSortingArgs Empty = new ReportConfigSortingArgs();

    /**
     * Direction of sort.
     * 
     */
    @InputImport(name="direction")
        private final @Nullable Input<String> direction;

    public Input<String> getDirection() {
        return this.direction == null ? Input.empty() : this.direction;
    }

    /**
     * The name of the column to sort.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public ReportConfigSortingArgs(
        @Nullable Input<String> direction,
        Input<String> name) {
        this.direction = direction;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ReportConfigSortingArgs() {
        this.direction = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigSortingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> direction;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigSortingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
        }

        public Builder setDirection(@Nullable Input<String> direction) {
            this.direction = direction;
            return this;
        }

        public Builder setDirection(@Nullable String direction) {
            this.direction = Input.ofNullable(direction);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public ReportConfigSortingArgs build() {
            return new ReportConfigSortingArgs(direction, name);
        }
    }
}
