// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.GeoMatchSetGeoMatchConstraintGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GeoMatchSetState extends io.pulumi.resources.ResourceArgs {

    public static final GeoMatchSetState Empty = new GeoMatchSetState();

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
     * 
     */
    @InputImport(name="geoMatchConstraints")
    private final @Nullable Input<List<GeoMatchSetGeoMatchConstraintGetArgs>> geoMatchConstraints;

    public Input<List<GeoMatchSetGeoMatchConstraintGetArgs>> getGeoMatchConstraints() {
        return this.geoMatchConstraints == null ? Input.empty() : this.geoMatchConstraints;
    }

    /**
     * The name or description of the GeoMatchSet.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public GeoMatchSetState(
        @Nullable Input<String> arn,
        @Nullable Input<List<GeoMatchSetGeoMatchConstraintGetArgs>> geoMatchConstraints,
        @Nullable Input<String> name) {
        this.arn = arn;
        this.geoMatchConstraints = geoMatchConstraints;
        this.name = name;
    }

    private GeoMatchSetState() {
        this.arn = Input.empty();
        this.geoMatchConstraints = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoMatchSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<GeoMatchSetGeoMatchConstraintGetArgs>> geoMatchConstraints;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GeoMatchSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.geoMatchConstraints = defaults.geoMatchConstraints;
    	      this.name = defaults.name;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setGeoMatchConstraints(@Nullable Input<List<GeoMatchSetGeoMatchConstraintGetArgs>> geoMatchConstraints) {
            this.geoMatchConstraints = geoMatchConstraints;
            return this;
        }

        public Builder setGeoMatchConstraints(@Nullable List<GeoMatchSetGeoMatchConstraintGetArgs> geoMatchConstraints) {
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
        public GeoMatchSetState build() {
            return new GeoMatchSetState(arn, geoMatchConstraints, name);
        }
    }
}
