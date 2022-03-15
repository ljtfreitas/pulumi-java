// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Input or output argument of a function or stored procedure.
 * 
 */
public final class GoogleCloudDatacatalogV1RoutineSpecArgumentResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1RoutineSpecArgumentResponse Empty = new GoogleCloudDatacatalogV1RoutineSpecArgumentResponse();

    /**
     * Specifies whether the argument is input or output.
     * 
     */
    @Import(name="mode", required=true)
      private final String mode;

    public String getMode() {
        return this.mode;
    }

    /**
     * The name of the argument. A return argument of a function might not have a name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Type of the argument. The exact value depends on the source system and the language.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudDatacatalogV1RoutineSpecArgumentResponse(
        String mode,
        String name,
        String type) {
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDatacatalogV1RoutineSpecArgumentResponse() {
        this.mode = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecArgumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1RoutineSpecArgumentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudDatacatalogV1RoutineSpecArgumentResponse build() {
            return new GoogleCloudDatacatalogV1RoutineSpecArgumentResponse(mode, name, type);
        }
    }
}
