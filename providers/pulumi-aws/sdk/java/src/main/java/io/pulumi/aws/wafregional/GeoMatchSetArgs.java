// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.aws.wafregional.inputs.GeoMatchSetGeoMatchConstraintArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GeoMatchSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GeoMatchSetArgs Empty = new GeoMatchSetArgs();

    /**
     * The Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
     * 
     */
    @InputImport(name="geoMatchConstraints")
    private final @Nullable Input<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints;

    public Input<List<GeoMatchSetGeoMatchConstraintArgs>> getGeoMatchConstraints() {
        return this.geoMatchConstraints == null ? Input.empty() : this.geoMatchConstraints;
    }

    /**
     * The name or description of the Geo Match Set.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public GeoMatchSetArgs(
        @Nullable Input<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints,
        @Nullable Input<String> name) {
        this.geoMatchConstraints = geoMatchConstraints;
        this.name = name;
    }

    private GeoMatchSetArgs() {
        this.geoMatchConstraints = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoMatchSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GeoMatchSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geoMatchConstraints = defaults.geoMatchConstraints;
    	      this.name = defaults.name;
        }

        public Builder setGeoMatchConstraints(@Nullable Input<List<GeoMatchSetGeoMatchConstraintArgs>> geoMatchConstraints) {
            this.geoMatchConstraints = geoMatchConstraints;
            return this;
        }

        public Builder setGeoMatchConstraints(@Nullable List<GeoMatchSetGeoMatchConstraintArgs> geoMatchConstraints) {
            this.geoMatchConstraints = Input.ofNullable(geoMatchConstraints);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public GeoMatchSetArgs build() {
            return new GeoMatchSetArgs(geoMatchConstraints, name);
        }
    }
}
