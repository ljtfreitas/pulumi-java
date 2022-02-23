// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecHttp2RouteMatchHeaderMatch;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteSpecHttp2RouteMatchHeader {
    /**
     * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
     * 
     */
    private final @Nullable Boolean invert;
    /**
     * The method and value to match the header value sent with a request. Specify one match method.
     * 
     */
    private final @Nullable RouteSpecHttp2RouteMatchHeaderMatch match;
    /**
     * A name for the HTTP header in the client request that will be matched on.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"invert","match","name"})
    private RouteSpecHttp2RouteMatchHeader(
        @Nullable Boolean invert,
        @Nullable RouteSpecHttp2RouteMatchHeaderMatch match,
        String name) {
        this.invert = invert;
        this.match = match;
        this.name = Objects.requireNonNull(name);
    }

    /**
     * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
     * 
     */
    public Optional<Boolean> getInvert() {
        return Optional.ofNullable(this.invert);
    }
    /**
     * The method and value to match the header value sent with a request. Specify one match method.
     * 
     */
    public Optional<RouteSpecHttp2RouteMatchHeaderMatch> getMatch() {
        return Optional.ofNullable(this.match);
    }
    /**
     * A name for the HTTP header in the client request that will be matched on.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteMatchHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean invert;
        private @Nullable RouteSpecHttp2RouteMatchHeaderMatch match;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteMatchHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invert = defaults.invert;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
        }

        public Builder setInvert(@Nullable Boolean invert) {
            this.invert = invert;
            return this;
        }

        public Builder setMatch(@Nullable RouteSpecHttp2RouteMatchHeaderMatch match) {
            this.match = match;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public RouteSpecHttp2RouteMatchHeader build() {
            return new RouteSpecHttp2RouteMatchHeader(invert, match, name);
        }
    }
}
