// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPlainArgs Empty = new GetFirewallPlainArgs();

    @Import(name="firewall", required=true)
    private String firewall;

    public String firewall() {
        return this.firewall;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetFirewallPlainArgs() {}

    private GetFirewallPlainArgs(GetFirewallPlainArgs $) {
        this.firewall = $.firewall;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPlainArgs $;

        public Builder() {
            $ = new GetFirewallPlainArgs();
        }

        public Builder(GetFirewallPlainArgs defaults) {
            $ = new GetFirewallPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder firewall(String firewall) {
            $.firewall = firewall;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetFirewallPlainArgs build() {
            $.firewall = Objects.requireNonNull($.firewall, "expected parameter 'firewall' to be non-null");
            return $;
        }
    }

}
