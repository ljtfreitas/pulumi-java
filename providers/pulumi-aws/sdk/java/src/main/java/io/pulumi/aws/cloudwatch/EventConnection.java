// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.EventConnectionArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionState;
import io.pulumi.aws.cloudwatch.outputs.EventConnectionAuthParameters;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an EventBridge connection resource.
 * 
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EventBridge Connection can be imported using the `name`, e.g., console
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventConnection:EventConnection test ngrok-connection
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventConnection:EventConnection")
public class EventConnection extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the connection.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the connection.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Parameters used for authorization. A maximum of 1 are allowed. Documented below.
     * 
     */
    @Export(name="authParameters", type=EventConnectionAuthParameters.class, parameters={})
    private Output<EventConnectionAuthParameters> authParameters;

    /**
     * @return Parameters used for authorization. A maximum of 1 are allowed. Documented below.
     * 
     */
    public Output<EventConnectionAuthParameters> getAuthParameters() {
        return this.authParameters;
    }
    /**
     * Choose the type of authorization to use for the connection. One of `API_KEY`,`BASIC`,`OAUTH_CLIENT_CREDENTIALS`.
     * 
     */
    @Export(name="authorizationType", type=String.class, parameters={})
    private Output<String> authorizationType;

    /**
     * @return Choose the type of authorization to use for the connection. One of `API_KEY`,`BASIC`,`OAUTH_CLIENT_CREDENTIALS`.
     * 
     */
    public Output<String> getAuthorizationType() {
        return this.authorizationType;
    }
    /**
     * Enter a description for the connection. Maximum of 512 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Enter a description for the connection. Maximum of 512 characters.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the new connection. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the new connection. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The Amazon Resource Name (ARN) of the secret created from the authorization parameters specified for the connection.
     * 
     */
    @Export(name="secretArn", type=String.class, parameters={})
    private Output<String> secretArn;

    /**
     * @return The Amazon Resource Name (ARN) of the secret created from the authorization parameters specified for the connection.
     * 
     */
    public Output<String> getSecretArn() {
        return this.secretArn;
    }

    public interface BuilderApplicator {
        public void apply(EventConnectionArgs.Builder a);
    }
    private static io.pulumi.aws.cloudwatch.EventConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudwatch.EventConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EventConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventConnection(String name) {
        this(name, EventConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventConnection(String name, EventConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventConnection(String name, EventConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventConnection:EventConnection", name, args == null ? EventConnectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EventConnection(String name, Output<String> id, @Nullable EventConnectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventConnection:EventConnection", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static EventConnection get(String name, Output<String> id, @Nullable EventConnectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventConnection(name, id, state, options);
    }
}
