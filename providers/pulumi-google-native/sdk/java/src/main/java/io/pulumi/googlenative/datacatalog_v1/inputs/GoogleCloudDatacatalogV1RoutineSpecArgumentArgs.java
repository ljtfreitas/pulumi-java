// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datacatalog_v1.enums.GoogleCloudDatacatalogV1RoutineSpecArgumentMode;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input or output argument of a function or stored procedure.
 * 
 */
public final class GoogleCloudDatacatalogV1RoutineSpecArgumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1RoutineSpecArgumentArgs Empty = new GoogleCloudDatacatalogV1RoutineSpecArgumentArgs();

    /**
     * Specifies whether the argument is input or output.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> mode;

    public Output<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * The name of the argument. A return argument of a function might not have a name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Type of the argument. The exact value depends on the source system and the language.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public GoogleCloudDatacatalogV1RoutineSpecArgumentArgs(
        @Nullable Output<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> mode,
        @Nullable Output<String> name,
        @Nullable Output<String> type) {
        this.mode = mode;
        this.name = name;
        this.type = type;
    }

    private GoogleCloudDatacatalogV1RoutineSpecArgumentArgs() {
        this.mode = Output.empty();
        this.name = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecArgumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> mode;
        private @Nullable Output<String> name;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1RoutineSpecArgumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder mode(@Nullable Output<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable GoogleCloudDatacatalogV1RoutineSpecArgumentMode mode) {
            this.mode = Output.ofNullable(mode);
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

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public GoogleCloudDatacatalogV1RoutineSpecArgumentArgs build() {
            return new GoogleCloudDatacatalogV1RoutineSpecArgumentArgs(mode, name, type);
        }
    }
}
