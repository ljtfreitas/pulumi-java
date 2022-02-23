// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastore_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastore_v1.enums.GoogleDatastoreAdminV1IndexedPropertyDirection;
import java.lang.String;
import java.util.Objects;


/**
 * A property of an index.
 * 
 */
public final class GoogleDatastoreAdminV1IndexedPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDatastoreAdminV1IndexedPropertyArgs Empty = new GoogleDatastoreAdminV1IndexedPropertyArgs();

    /**
     * The indexed property's direction. Must not be DIRECTION_UNSPECIFIED.
     * 
     */
    @InputImport(name="direction", required=true)
      private final Input<GoogleDatastoreAdminV1IndexedPropertyDirection> direction;

    public Input<GoogleDatastoreAdminV1IndexedPropertyDirection> getDirection() {
        return this.direction;
    }

    /**
     * The property name to index.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public GoogleDatastoreAdminV1IndexedPropertyArgs(
        Input<GoogleDatastoreAdminV1IndexedPropertyDirection> direction,
        Input<String> name) {
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GoogleDatastoreAdminV1IndexedPropertyArgs() {
        this.direction = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDatastoreAdminV1IndexedPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GoogleDatastoreAdminV1IndexedPropertyDirection> direction;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDatastoreAdminV1IndexedPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
        }

        public Builder setDirection(Input<GoogleDatastoreAdminV1IndexedPropertyDirection> direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDirection(GoogleDatastoreAdminV1IndexedPropertyDirection direction) {
            this.direction = Input.of(Objects.requireNonNull(direction));
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
        public GoogleDatastoreAdminV1IndexedPropertyArgs build() {
            return new GoogleDatastoreAdminV1IndexedPropertyArgs(direction, name);
        }
    }
}
