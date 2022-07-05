// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionHealthCheckServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionHealthCheckServiceArgs Empty = new GetRegionHealthCheckServiceArgs();

    @Import(name="healthCheckService", required=true)
    private Output<String> healthCheckService;

    public Output<String> healthCheckService() {
        return this.healthCheckService;
    }

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

    private GetRegionHealthCheckServiceArgs() {}

    private GetRegionHealthCheckServiceArgs(GetRegionHealthCheckServiceArgs $) {
        this.healthCheckService = $.healthCheckService;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionHealthCheckServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionHealthCheckServiceArgs $;

        public Builder() {
            $ = new GetRegionHealthCheckServiceArgs();
        }

        public Builder(GetRegionHealthCheckServiceArgs defaults) {
            $ = new GetRegionHealthCheckServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder healthCheckService(Output<String> healthCheckService) {
            $.healthCheckService = healthCheckService;
            return this;
        }

        public Builder healthCheckService(String healthCheckService) {
            return healthCheckService(Output.of(healthCheckService));
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

        public GetRegionHealthCheckServiceArgs build() {
            $.healthCheckService = Objects.requireNonNull($.healthCheckService, "expected parameter 'healthCheckService' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
