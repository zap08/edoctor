package com.infosys.eDoctor.service;

import com.infosys.eDoctor.DTO.AppointmentDTO;
import com.infosys.eDoctor.entity.Appointment;
import com.infosys.eDoctor.entity.Doctor;
import com.infosys.eDoctor.entity.Patient;
import com.infosys.eDoctor.entity.Users;
import com.infosys.eDoctor.repository.AppointmentRepo;
import com.infosys.eDoctor.repository.DoctorRepo;
import com.infosys.eDoctor.repository.PatientRepo;

import java.io.UnsupportedEncodingException;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {AppointmentService.class, AppointmentRepo.class, DoctorRepo.class,
        JavaMailSender.class, PatientRepo.class})
@ExtendWith(SpringExtension.class)
class AppointmentServiceDiffblueTest {
    @Autowired
    private AppointmentService appointmentService;

    /**
     * Test {@link AppointmentService#getAllAppointments()}.
     * <p>
     * Method under test: {@link AppointmentService#getAllAppointments()}
     */
    @Test
    @DisplayName("Test getAllAppointments()")
    @Disabled("TODO: Complete this test")
    void testGetAllAppointments() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@4e8e4e26 testClass = com.infosys.eDoctor.service.DiffblueFakeClass9, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService.getAllAppointments();
    }

    /**
     * Test {@link AppointmentService#getAppointment(int)}.
     * <p>
     * Method under test: {@link AppointmentService#getAppointment(int)}
     */
    @Test
    @DisplayName("Test getAppointment(int)")
    @Disabled("TODO: Complete this test")
    void testGetAppointment() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@511eec02 testClass = com.infosys.eDoctor.service.DiffblueFakeClass10, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService.getAppointment(1);
    }

    /**
     * Test {@link AppointmentService#getAppointmentsByDoctorId(String)}.
     * <p>
     * Method under test:
     * {@link AppointmentService#getAppointmentsByDoctorId(String)}
     */
    @Test
    @DisplayName("Test getAppointmentsByDoctorId(String)")
    @Disabled("TODO: Complete this test")
    void testGetAppointmentsByDoctorId() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@14664883 testClass = com.infosys.eDoctor.service.DiffblueFakeClass13, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService.getAppointmentsByDoctorId("42");
    }

    /**
     * Test {@link AppointmentService#getAppointmentsByPatientId(int)}.
     * <p>
     * Method under test: {@link AppointmentService#getAppointmentsByPatientId(int)}
     */
    @Test
    @DisplayName("Test getAppointmentsByPatientId(int)")
    @Disabled("TODO: Complete this test")
    void testGetAppointmentsByPatientId() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@46fa1103 testClass = com.infosys.eDoctor.service.DiffblueFakeClass14, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService.getAppointmentsByPatientId(1);
    }

    /**
     * Test {@link AppointmentService#getAppointmentsByDate(LocalDate)}.
     * <p>
     * Method under test:
     * {@link AppointmentService#getAppointmentsByDate(LocalDate)}
     */
    @Test
    @DisplayName("Test getAppointmentsByDate(LocalDate)")
    @Disabled("TODO: Complete this test")
    void testGetAppointmentsByDate() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@328adca0 testClass = com.infosys.eDoctor.service.DiffblueFakeClass12, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService.getAppointmentsByDate(LocalDate.of(1970, 1, 1));
    }

    /**
     * Test
     * {@link AppointmentService#getPatientsByDoctorAndDate(String, LocalDate)}.
     * <p>
     * Method under test:
     * {@link AppointmentService#getPatientsByDoctorAndDate(String, LocalDate)}
     */
    @Test
    @DisplayName("Test getPatientsByDoctorAndDate(String, LocalDate)")
    @Disabled("TODO: Complete this test")
    void testGetPatientsByDoctorAndDate() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@70a25a40 testClass = com.infosys.eDoctor.service.DiffblueFakeClass16, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService.getPatientsByDoctorAndDate("42", LocalDate.of(1970, 1, 1));
    }

    /**
     * Test
     * {@link AppointmentService#getAvailabilityCountForDoctor(String, LocalDate)}.
     * <p>
     * Method under test:
     * {@link AppointmentService#getAvailabilityCountForDoctor(String, LocalDate)}
     */
    @Test
    @DisplayName("Test getAvailabilityCountForDoctor(String, LocalDate)")
    @Disabled("TODO: Complete this test")
    void testGetAvailabilityCountForDoctor() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@1a37d50d testClass = com.infosys.eDoctor.service.DiffblueFakeClass15, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService.getAvailabilityCountForDoctor("42", LocalDate.of(1970, 1, 1));
    }

    /**
     * Test {@link AppointmentService#addAppointment(Appointment)}.
     * <p>
     * Method under test: {@link AppointmentService#addAppointment(Appointment)}
     */
    @Test
    @DisplayName("Test addAppointment(Appointment)")
    @Disabled("TODO: Complete this test")
    void testAddAppointment() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Appointment appointment = null;

        // Act
        Appointment actualAddAppointmentResult = this.appointmentService.addAppointment(appointment);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Test {@link AppointmentService#updateAppointment(Appointment)}.
     * <p>
     * Method under test: {@link AppointmentService#updateAppointment(Appointment)}
     */
    @Test
    @DisplayName("Test updateAppointment(Appointment)")
    @Disabled("TODO: Complete this test")
    void testUpdateAppointment() throws UnsupportedEncodingException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@748910bb testClass = com.infosys.eDoctor.service.DiffblueFakeClass18, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        Doctor doctor = new Doctor();
        doctor.setAppointments(new ArrayList<>());
        doctor.setDoctorId("42");
        doctor.setDoctorName("Doctor Name");
        doctor.setExperience("Experience");
        doctor.setLocation("Location");
        doctor.setMobileNo("Mobile No");
        doctor.setProfilePhoto("AXAXAXAX".getBytes("UTF-8"));
        doctor.setSpeciality("Speciality");
        doctor.setUsers(new Users());

        Patient patient = new Patient();
        patient.setAddress("42 Main St");
        patient.setAge(1);
        patient.setAppointments(new ArrayList<>());
        patient.setBloodGroup("Blood Group");
        patient.setGender("Gender");
        patient.setMobileNo("Mobile No");
        patient.setPatientId(1);
        patient.setPatientName("Patient Name");
        patient.setRequestStatus("Request Status");
        patient.setUsers2(new Users());

        Users users = new Users();
        users.setDoctor(doctor);
        users.setEmail("jane.doe@example.org");
        users.setName("Name");
        users.setPassword("iloveyou");
        users.setPatient(patient);
        users.setResetToken("ABC123");
        users.setResetTokenExpiry(LocalDate.of(1970, 1, 1).atStartOfDay());
        users.setUserType("User Type");

        Doctor doctor2 = new Doctor();
        doctor2.setAppointments(new ArrayList<>());
        doctor2.setDoctorId("42");
        doctor2.setDoctorName("Doctor Name");
        doctor2.setExperience("Experience");
        doctor2.setLocation("Location");
        doctor2.setMobileNo("Mobile No");
        doctor2.setProfilePhoto("AXAXAXAX".getBytes("UTF-8"));
        doctor2.setSpeciality("Speciality");
        doctor2.setUsers(users);

        Doctor doctor3 = new Doctor();
        doctor3.setAppointments(new ArrayList<>());
        doctor3.setDoctorId("42");
        doctor3.setDoctorName("Doctor Name");
        doctor3.setExperience("Experience");
        doctor3.setLocation("Location");
        doctor3.setMobileNo("Mobile No");
        doctor3.setProfilePhoto("AXAXAXAX".getBytes("UTF-8"));
        doctor3.setSpeciality("Speciality");
        doctor3.setUsers(new Users());

        Patient patient2 = new Patient();
        patient2.setAddress("42 Main St");
        patient2.setAge(1);
        patient2.setAppointments(new ArrayList<>());
        patient2.setBloodGroup("Blood Group");
        patient2.setGender("Gender");
        patient2.setMobileNo("Mobile No");
        patient2.setPatientId(1);
        patient2.setPatientName("Patient Name");
        patient2.setRequestStatus("Request Status");
        patient2.setUsers2(new Users());

        Users users2 = new Users();
        users2.setDoctor(doctor3);
        users2.setEmail("jane.doe@example.org");
        users2.setName("Name");
        users2.setPassword("iloveyou");
        users2.setPatient(patient2);
        users2.setResetToken("ABC123");
        users2.setResetTokenExpiry(LocalDate.of(1970, 1, 1).atStartOfDay());
        users2.setUserType("User Type");

        Patient patient3 = new Patient();
        patient3.setAddress("42 Main St");
        patient3.setAge(1);
        patient3.setAppointments(new ArrayList<>());
        patient3.setBloodGroup("Blood Group");
        patient3.setGender("Gender");
        patient3.setMobileNo("Mobile No");
        patient3.setPatientId(1);
        patient3.setPatientName("Patient Name");
        patient3.setRequestStatus("Request Status");
        patient3.setUsers2(users2);

        Appointment appointment = new Appointment();
        appointment.setAppointmentDate(LocalDate.of(1970, 1, 1));
        appointment.setAppointmentId(1);
        appointment.setAppointmentStatus("Appointment Status");
        appointment.setDoctor(doctor2);
        appointment.setPatient(patient3);
        appointment.setRemark("Remark");

        // Act
        appointmentService.updateAppointment(appointment);
    }

    /**
     * Test {@link AppointmentService#deleteAppointment(int)}.
     * <p>
     * Method under test: {@link AppointmentService#deleteAppointment(int)}
     */
    @Test
    @DisplayName("Test deleteAppointment(int)")
    @Disabled("TODO: Complete this test")
    void testDeleteAppointment() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@3937d7d7 testClass = com.infosys.eDoctor.service.DiffblueFakeClass8, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService.deleteAppointment(1);
    }

    /**
     * Test {@link AppointmentService#getAppointmentEntity(int)}.
     * <p>
     * Method under test: {@link AppointmentService#getAppointmentEntity(int)}
     */
    @Test
    @DisplayName("Test getAppointmentEntity(int)")
    @Disabled("TODO: Complete this test")
    void testGetAppointmentEntity() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@550edb3a testClass = com.infosys.eDoctor.service.DiffblueFakeClass11, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService.getAppointmentEntity(1);
    }

    /**
     * Test {@link AppointmentService#sendEmail(String, String, String)}.
     * <p>
     * Method under test:
     * {@link AppointmentService#sendEmail(String, String, String)}
     */
    @Test
    @DisplayName("Test sendEmail(String, String, String)")
    @Disabled("TODO: Complete this test")
    void testSendEmail() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@5da968db testClass = com.infosys.eDoctor.service.DiffblueFakeClass17, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService.sendEmail("alice.liddell@example.org", "Hello from the Dreaming Spires",
                "Not all who wander are lost");
    }

    /**
     * Test {@link AppointmentService#createAppointment(AppointmentDTO)}.
     * <p>
     * Method under test:
     * {@link AppointmentService#createAppointment(AppointmentDTO)}
     */
    @Test
    @DisplayName("Test createAppointment(AppointmentDTO)")
    @Disabled("TODO: Complete this test")
    void testCreateAppointment() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@5cd94364 testClass = com.infosys.eDoctor.service.DiffblueFakeClass7, locations = [], classes = [com.infosys.eDoctor.service.AppointmentService, com.infosys.eDoctor.repository.AppointmentRepo, com.infosys.eDoctor.repository.DoctorRepo, org.springframework.mail.javamail.JavaMailSender, com.infosys.eDoctor.repository.PatientRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@4049611f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3bb923cc, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@630e6ba4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@91f7df4, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6b050341], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        appointmentService
                .createAppointment(new AppointmentDTO(1, LocalDate.of(1970, 1, 1), "Appointment Status", "Remark", 1, "42"));
    }
}
