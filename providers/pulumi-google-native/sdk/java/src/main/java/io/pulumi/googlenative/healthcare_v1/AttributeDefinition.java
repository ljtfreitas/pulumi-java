// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1.AttributeDefinitionArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Attribute definition in the parent consent store.
 * 
 */
@ResourceType(type="google-native:healthcare/v1:AttributeDefinition")
public class AttributeDefinition extends io.pulumi.resources.CustomResource {
    /**
     * Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
     * 
     */
    @Export(name="allowedValues", type=List.class, parameters={String.class})
    private Output<List<String>> allowedValues;

    /**
     * @return Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
     * 
     */
    public Output<List<String>> getAllowedValues() {
        return this.allowedValues;
    }
    /**
     * The category of the attribute. The value of this field cannot be changed after creation.
     * 
     */
    @Export(name="category", type=String.class, parameters={})
    private Output<String> category;

    /**
     * @return The category of the attribute. The value of this field cannot be changed after creation.
     * 
     */
    public Output<String> getCategory() {
        return this.category;
    }
    /**
     * Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
     * 
     */
    @Export(name="consentDefaultValues", type=List.class, parameters={String.class})
    private Output<List<String>> consentDefaultValues;

    /**
     * @return Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
     * 
     */
    public Output<List<String>> getConsentDefaultValues() {
        return this.consentDefaultValues;
    }
    /**
     * Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
     * 
     */
    @Export(name="dataMappingDefaultValue", type=String.class, parameters={})
    private Output<String> dataMappingDefaultValue;

    /**
     * @return Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
     * 
     */
    public Output<String> getDataMappingDefaultValue() {
        return this.dataMappingDefaultValue;
    }
    /**
     * Optional. A description of the attribute.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A description of the attribute.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(AttributeDefinitionArgs.Builder a);
    }
    private static io.pulumi.googlenative.healthcare_v1.AttributeDefinitionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.healthcare_v1.AttributeDefinitionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AttributeDefinition(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AttributeDefinition(String name) {
        this(name, AttributeDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AttributeDefinition(String name, AttributeDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AttributeDefinition(String name, AttributeDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:AttributeDefinition", name, args == null ? AttributeDefinitionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AttributeDefinition(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:AttributeDefinition", name, null, makeResourceOptions(options, id));
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
    public static AttributeDefinition get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AttributeDefinition(name, id, options);
    }
}
