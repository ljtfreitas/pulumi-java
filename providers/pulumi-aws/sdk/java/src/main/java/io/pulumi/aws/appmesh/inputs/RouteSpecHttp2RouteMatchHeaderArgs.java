// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderMatchArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttp2RouteMatchHeaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteMatchHeaderArgs Empty = new RouteSpecHttp2RouteMatchHeaderArgs();

    /**
     * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
     * 
     */
    @InputImport(name="invert")
    private final @Nullable Input<Boolean> invert;

    public Input<Boolean> getInvert() {
        return this.invert == null ? Input.empty() : this.invert;
    }

    /**
     * The method and value to match the header value sent with a request. Specify one match method.
     * 
     */
    @InputImport(name="match")
    private final @Nullable Input<RouteSpecHttp2RouteMatchHeaderMatchArgs> match;

    public Input<RouteSpecHttp2RouteMatchHeaderMatchArgs> getMatch() {
        return this.match == null ? Input.empty() : this.match;
    }

    /**
     * A name for the HTTP header in the client request that will be matched on.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public RouteSpecHttp2RouteMatchHeaderArgs(
        @Nullable Input<Boolean> invert,
        @Nullable Input<RouteSpecHttp2RouteMatchHeaderMatchArgs> match,
        Input<String> name) {
        this.invert = invert;
        this.match = match;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private RouteSpecHttp2RouteMatchHeaderArgs() {
        this.invert = Input.empty();
        this.match = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteMatchHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> invert;
        private @Nullable Input<RouteSpecHttp2RouteMatchHeaderMatchArgs> match;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteMatchHeaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invert = defaults.invert;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
        }

        public Builder setInvert(@Nullable Input<Boolean> invert) {
            this.invert = invert;
            return this;
        }

        public Builder setInvert(@Nullable Boolean invert) {
            this.invert = Input.ofNullable(invert);
            return this;
        }

        public Builder setMatch(@Nullable Input<RouteSpecHttp2RouteMatchHeaderMatchArgs> match) {
            this.match = match;
            return this;
        }

        public Builder setMatch(@Nullable RouteSpecHttp2RouteMatchHeaderMatchArgs match) {
            this.match = Input.ofNullable(match);
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
        public RouteSpecHttp2RouteMatchHeaderArgs build() {
            return new RouteSpecHttp2RouteMatchHeaderArgs(invert, match, name);
        }
    }
}
