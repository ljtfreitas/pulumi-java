// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.alb.ListenerArgs;
import io.pulumi.aws.alb.inputs.ListenerState;
import io.pulumi.aws.alb.outputs.ListenerDefaultAction;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Load Balancer Listener resource.
 * 
 * > **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Listeners can be imported using their ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:alb/listener:Listener front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener/app/front-end-alb/8e4497da625e2d8a/9ab28ade35828f96
 * ```
 * 
 */
@ResourceType(type="aws:alb/listener:Listener")
public class Listener extends io.pulumi.resources.CustomResource {
    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    @OutputExport(name="alpnPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> alpnPolicy;

    /**
     * @return Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    public Output</* @Nullable */ String> getAlpnPolicy() {
        return this.alpnPolicy;
    }
    /**
     * ARN of the target group.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the target group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    @OutputExport(name="certificateArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateArn;

    /**
     * @return ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    public Output</* @Nullable */ String> getCertificateArn() {
        return this.certificateArn;
    }
    /**
     * Configuration block for default actions. Detailed below.
     * 
     */
    @OutputExport(name="defaultActions", type=List.class, parameters={ListenerDefaultAction.class})
    private Output<List<ListenerDefaultAction>> defaultActions;

    /**
     * @return Configuration block for default actions. Detailed below.
     * 
     */
    public Output<List<ListenerDefaultAction>> getDefaultActions() {
        return this.defaultActions;
    }
    /**
     * ARN of the load balancer.
     * 
     */
    @OutputExport(name="loadBalancerArn", type=String.class, parameters={})
    private Output<String> loadBalancerArn;

    /**
     * @return ARN of the load balancer.
     * 
     */
    public Output<String> getLoadBalancerArn() {
        return this.loadBalancerArn;
    }
    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    @OutputExport(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    public Output<String> getProtocol() {
        return this.protocol;
    }
    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    @OutputExport(name="sslPolicy", type=String.class, parameters={})
    private Output<String> sslPolicy;

    /**
     * @return Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    public Output<String> getSslPolicy() {
        return this.sslPolicy;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Listener(String name, Input<String> id, @Nullable ListenerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/listener:Listener", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("aws:applicationloadbalancing/listener:Listener").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Listener get(String name, Input<String> id, @Nullable ListenerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}
