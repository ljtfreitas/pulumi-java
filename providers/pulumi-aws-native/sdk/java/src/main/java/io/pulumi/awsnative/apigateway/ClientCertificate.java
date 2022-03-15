// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.ClientCertificateArgs;
import io.pulumi.awsnative.apigateway.outputs.ClientCertificateTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::ClientCertificate
 * 
 */
@ResourceType(type="aws-native:apigateway:ClientCertificate")
public class ClientCertificate extends io.pulumi.resources.CustomResource {
    /**
     * The Primary Identifier of the Client Certficate, generated by a Create API Call
     * 
     */
    @Export(name="clientCertificateId", type=String.class, parameters={})
    private Output<String> clientCertificateId;

    /**
     * @return The Primary Identifier of the Client Certficate, generated by a Create API Call
     * 
     */
    public Output<String> getClientCertificateId() {
        return this.clientCertificateId;
    }
    /**
     * A description of the client certificate.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the client certificate.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the client certificate.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ClientCertificateTag.class})
    private Output</* @Nullable */ List<ClientCertificateTag>> tags;

    /**
     * @return An array of arbitrary tags (key-value pairs) to associate with the client certificate.
     * 
     */
    public Output</* @Nullable */ List<ClientCertificateTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ClientCertificateArgs.Builder a);
    }
    private static io.pulumi.awsnative.apigateway.ClientCertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.apigateway.ClientCertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ClientCertificate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientCertificate(String name) {
        this(name, ClientCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientCertificate(String name, @Nullable ClientCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientCertificate(String name, @Nullable ClientCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:ClientCertificate", name, args == null ? ClientCertificateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ClientCertificate(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:ClientCertificate", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ClientCertificate get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClientCertificate(name, id, options);
    }
}
