// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFunctionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionPlainArgs Empty = new GetFunctionPlainArgs();

    @Import(name="functionId", required=true)
    private String functionId;

    public String functionId() {
        return this.functionId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetFunctionPlainArgs() {}

    private GetFunctionPlainArgs(GetFunctionPlainArgs $) {
        this.functionId = $.functionId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionPlainArgs $;

        public Builder() {
            $ = new GetFunctionPlainArgs();
        }

        public Builder(GetFunctionPlainArgs defaults) {
            $ = new GetFunctionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionId(String functionId) {
            $.functionId = functionId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetFunctionPlainArgs build() {
            $.functionId = Objects.requireNonNull($.functionId, "expected parameter 'functionId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
