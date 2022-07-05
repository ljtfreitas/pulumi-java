// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouterArgs Empty = new GetRouterArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="router", required=true)
    private Output<String> router;

    public Output<String> router() {
        return this.router;
    }

    private GetRouterArgs() {}

    private GetRouterArgs(GetRouterArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.router = $.router;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouterArgs $;

        public Builder() {
            $ = new GetRouterArgs();
        }

        public Builder(GetRouterArgs defaults) {
            $ = new GetRouterArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder router(Output<String> router) {
            $.router = router;
            return this;
        }

        public Builder router(String router) {
            return router(Output.of(router));
        }

        public GetRouterArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.router = Objects.requireNonNull($.router, "expected parameter 'router' to be non-null");
            return $;
        }
    }

}
