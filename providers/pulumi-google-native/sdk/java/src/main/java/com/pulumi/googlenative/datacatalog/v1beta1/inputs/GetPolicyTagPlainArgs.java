// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyTagPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyTagPlainArgs Empty = new GetPolicyTagPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="policyTagId", required=true)
    private String policyTagId;

    public String policyTagId() {
        return this.policyTagId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="taxonomyId", required=true)
    private String taxonomyId;

    public String taxonomyId() {
        return this.taxonomyId;
    }

    private GetPolicyTagPlainArgs() {}

    private GetPolicyTagPlainArgs(GetPolicyTagPlainArgs $) {
        this.location = $.location;
        this.policyTagId = $.policyTagId;
        this.project = $.project;
        this.taxonomyId = $.taxonomyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyTagPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyTagPlainArgs $;

        public Builder() {
            $ = new GetPolicyTagPlainArgs();
        }

        public Builder(GetPolicyTagPlainArgs defaults) {
            $ = new GetPolicyTagPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder policyTagId(String policyTagId) {
            $.policyTagId = policyTagId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder taxonomyId(String taxonomyId) {
            $.taxonomyId = taxonomyId;
            return this;
        }

        public GetPolicyTagPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.policyTagId = Objects.requireNonNull($.policyTagId, "expected parameter 'policyTagId' to be non-null");
            $.taxonomyId = Objects.requireNonNull($.taxonomyId, "expected parameter 'taxonomyId' to be non-null");
            return $;
        }
    }

}
