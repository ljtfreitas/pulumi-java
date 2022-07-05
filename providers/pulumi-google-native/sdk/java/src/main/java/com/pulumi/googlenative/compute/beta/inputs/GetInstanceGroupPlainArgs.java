// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceGroupPlainArgs Empty = new GetInstanceGroupPlainArgs();

    @Import(name="instanceGroup", required=true)
    private String instanceGroup;

    public String instanceGroup() {
        return this.instanceGroup;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private GetInstanceGroupPlainArgs() {}

    private GetInstanceGroupPlainArgs(GetInstanceGroupPlainArgs $) {
        this.instanceGroup = $.instanceGroup;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceGroupPlainArgs $;

        public Builder() {
            $ = new GetInstanceGroupPlainArgs();
        }

        public Builder(GetInstanceGroupPlainArgs defaults) {
            $ = new GetInstanceGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceGroup(String instanceGroup) {
            $.instanceGroup = instanceGroup;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetInstanceGroupPlainArgs build() {
            $.instanceGroup = Objects.requireNonNull($.instanceGroup, "expected parameter 'instanceGroup' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
