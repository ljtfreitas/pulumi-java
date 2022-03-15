// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.inputs;

import io.pulumi.awsnative.refactorspaces.enums.RouteActivationState;
import io.pulumi.awsnative.refactorspaces.enums.RouteMethod;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteUriPathRouteInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteUriPathRouteInputArgs Empty = new RouteUriPathRouteInputArgs();

    @Import(name="activationState", required=true)
      private final Output<RouteActivationState> activationState;

    public Output<RouteActivationState> getActivationState() {
        return this.activationState;
    }

    @Import(name="includeChildPaths")
      private final @Nullable Output<Boolean> includeChildPaths;

    public Output<Boolean> getIncludeChildPaths() {
        return this.includeChildPaths == null ? Output.empty() : this.includeChildPaths;
    }

    @Import(name="methods")
      private final @Nullable Output<List<RouteMethod>> methods;

    public Output<List<RouteMethod>> getMethods() {
        return this.methods == null ? Output.empty() : this.methods;
    }

    @Import(name="sourcePath")
      private final @Nullable Output<String> sourcePath;

    public Output<String> getSourcePath() {
        return this.sourcePath == null ? Output.empty() : this.sourcePath;
    }

    public RouteUriPathRouteInputArgs(
        Output<RouteActivationState> activationState,
        @Nullable Output<Boolean> includeChildPaths,
        @Nullable Output<List<RouteMethod>> methods,
        @Nullable Output<String> sourcePath) {
        this.activationState = Objects.requireNonNull(activationState, "expected parameter 'activationState' to be non-null");
        this.includeChildPaths = includeChildPaths;
        this.methods = methods;
        this.sourcePath = sourcePath;
    }

    private RouteUriPathRouteInputArgs() {
        this.activationState = Output.empty();
        this.includeChildPaths = Output.empty();
        this.methods = Output.empty();
        this.sourcePath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteUriPathRouteInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RouteActivationState> activationState;
        private @Nullable Output<Boolean> includeChildPaths;
        private @Nullable Output<List<RouteMethod>> methods;
        private @Nullable Output<String> sourcePath;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteUriPathRouteInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationState = defaults.activationState;
    	      this.includeChildPaths = defaults.includeChildPaths;
    	      this.methods = defaults.methods;
    	      this.sourcePath = defaults.sourcePath;
        }

        public Builder activationState(Output<RouteActivationState> activationState) {
            this.activationState = Objects.requireNonNull(activationState);
            return this;
        }

        public Builder activationState(RouteActivationState activationState) {
            this.activationState = Output.of(Objects.requireNonNull(activationState));
            return this;
        }

        public Builder includeChildPaths(@Nullable Output<Boolean> includeChildPaths) {
            this.includeChildPaths = includeChildPaths;
            return this;
        }

        public Builder includeChildPaths(@Nullable Boolean includeChildPaths) {
            this.includeChildPaths = Output.ofNullable(includeChildPaths);
            return this;
        }

        public Builder methods(@Nullable Output<List<RouteMethod>> methods) {
            this.methods = methods;
            return this;
        }

        public Builder methods(@Nullable List<RouteMethod> methods) {
            this.methods = Output.ofNullable(methods);
            return this;
        }

        public Builder sourcePath(@Nullable Output<String> sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }

        public Builder sourcePath(@Nullable String sourcePath) {
            this.sourcePath = Output.ofNullable(sourcePath);
            return this;
        }
        public RouteUriPathRouteInputArgs build() {
            return new RouteUriPathRouteInputArgs(activationState, includeChildPaths, methods, sourcePath);
        }
    }
}
