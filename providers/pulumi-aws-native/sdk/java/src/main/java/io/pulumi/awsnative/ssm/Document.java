// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ssm.DocumentArgs;
import io.pulumi.awsnative.ssm.enums.DocumentFormat;
import io.pulumi.awsnative.ssm.enums.DocumentType;
import io.pulumi.awsnative.ssm.outputs.DocumentAttachmentsSource;
import io.pulumi.awsnative.ssm.outputs.DocumentRequires;
import io.pulumi.awsnative.ssm.outputs.DocumentTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::SSM::Document resource is an SSM document in AWS Systems Manager that defines the actions that Systems Manager performs, which can be used to set up and run commands on your instances.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ssm:Document")
public class Document extends io.pulumi.resources.CustomResource {
    /**
     * A list of key and value pairs that describe attachments to a version of a document.
     * 
     */
    @Export(name="attachments", type=List.class, parameters={DocumentAttachmentsSource.class})
    private Output</* @Nullable */ List<DocumentAttachmentsSource>> attachments;

    /**
     * @return A list of key and value pairs that describe attachments to a version of a document.
     * 
     */
    public Output</* @Nullable */ List<DocumentAttachmentsSource>> getAttachments() {
        return this.attachments;
    }
    /**
     * The content for the Systems Manager document in JSON, YAML or String format.
     * 
     */
    @Export(name="content", type=Object.class, parameters={})
    private Output<Object> content;

    /**
     * @return The content for the Systems Manager document in JSON, YAML or String format.
     * 
     */
    public Output<Object> getContent() {
        return this.content;
    }
    /**
     * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default format.
     * 
     */
    @Export(name="documentFormat", type=DocumentFormat.class, parameters={})
    private Output</* @Nullable */ DocumentFormat> documentFormat;

    /**
     * @return Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default format.
     * 
     */
    public Output</* @Nullable */ DocumentFormat> getDocumentFormat() {
        return this.documentFormat;
    }
    /**
     * The type of document to create.
     * 
     */
    @Export(name="documentType", type=DocumentType.class, parameters={})
    private Output</* @Nullable */ DocumentType> documentType;

    /**
     * @return The type of document to create.
     * 
     */
    public Output</* @Nullable */ DocumentType> getDocumentType() {
        return this.documentType;
    }
    /**
     * A name for the Systems Manager document.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return A name for the Systems Manager document.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
     * 
     */
    @Export(name="requires", type=List.class, parameters={DocumentRequires.class})
    private Output</* @Nullable */ List<DocumentRequires>> requires;

    /**
     * @return A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
     * 
     */
    public Output</* @Nullable */ List<DocumentRequires>> getRequires() {
        return this.requires;
    }
    /**
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DocumentTag.class})
    private Output</* @Nullable */ List<DocumentTag>> tags;

    /**
     * @return Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment.
     * 
     */
    public Output</* @Nullable */ List<DocumentTag>> getTags() {
        return this.tags;
    }
    /**
     * Specify a target type to define the kinds of resources the document can run on.
     * 
     */
    @Export(name="targetType", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetType;

    /**
     * @return Specify a target type to define the kinds of resources the document can run on.
     * 
     */
    public Output</* @Nullable */ String> getTargetType() {
        return this.targetType;
    }
    /**
     * An optional field specifying the version of the artifact you are creating with the document. This value is unique across all versions of a document, and cannot be changed.
     * 
     */
    @Export(name="versionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> versionName;

    /**
     * @return An optional field specifying the version of the artifact you are creating with the document. This value is unique across all versions of a document, and cannot be changed.
     * 
     */
    public Output</* @Nullable */ String> getVersionName() {
        return this.versionName;
    }

    public interface BuilderApplicator {
        public void apply(DocumentArgs.Builder a);
    }
    private static io.pulumi.awsnative.ssm.DocumentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ssm.DocumentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Document(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Document(String name) {
        this(name, DocumentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Document(String name, DocumentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Document(String name, DocumentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssm:Document", name, args == null ? DocumentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Document(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssm:Document", name, null, makeResourceOptions(options, id));
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
    public static Document get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Document(name, id, options);
    }
}
